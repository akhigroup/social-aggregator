package com.probableuniverse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.probableuniverse.domain.instagram.AccessToken;
import com.probableuniverse.domain.instagram.users.UserEnvelope;
import com.probableuniverse.service.InstagramService;

@Service
public class InstagramServiceImpl implements InstagramService{

	@Autowired
	@Value("${insta.client.id}")
	private String instagramClientId;
	
	@Autowired
	@Value("${insta.client.secret}")
	private String instagramClientSecret;
	
	@Autowired
	@Value("${insta.redirect.uri}")
	private String instagramRedirectUri;
	
	@Autowired
	@Value("${insta.code.request}")
	private String instagramCodeRequest;
	
	@Autowired
	@Value("${insta.oauth.request}")
	private String instagramOauthRequest;
	
	@Autowired
	@Value("${insta.api.users.self.uri}")
	private String instagramUsersSelfRequest;
	
	public AccessToken getAccessToken(String code){
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setContentType(MediaType.MULTIPART_FORM_DATA);
		
		MultiValueMap<String, String> vars = new LinkedMultiValueMap<String, String>();
        vars.add("client_id", instagramClientId);
        vars.add("client_secret",instagramClientSecret);
        vars.add("grant_type", "authorization_code");
        vars.add("redirect_uri", instagramRedirectUri);
        vars.add("code", code);
        
        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<MultiValueMap<String, String>>(vars, requestHeaders);
        
        AccessToken accessToken = new AccessToken();
		try{
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<AccessToken> response = restTemplate.exchange(instagramOauthRequest, HttpMethod.POST, requestEntity, AccessToken.class);
			accessToken = response.getBody();
			return accessToken;
		}catch(Exception e){
			//add logger
			System.out.println("theres an error, add a logger: " + e.getStackTrace());
		}
		return accessToken;
	}
	
	public UserEnvelope getUsersSelf(String accessToken){
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		HttpEntity<?> entity = new HttpEntity<>(headers);
		
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(instagramUsersSelfRequest)
		        .queryParam("access_token", accessToken);

		UserEnvelope userEnvelope = new UserEnvelope();
		try{
			RestTemplate restTemplate = new RestTemplate();
			
			HttpEntity<UserEnvelope> response = restTemplate.exchange(builder.build().encode().toUri(), HttpMethod.GET, entity, UserEnvelope.class);
			userEnvelope = response.getBody();
			return userEnvelope;
		}catch(Exception e){
			System.out.println("theres an error, add a logger: " + e.getStackTrace());
		}
		return userEnvelope;
		
	}
	
}
