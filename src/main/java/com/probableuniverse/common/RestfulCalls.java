package com.probableuniverse.common;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class RestfulCalls {
/*
 * TODO: Finish this impl, trying to make a generic class to handle all RESTful calls
 */
	public HttpEntity<?> get(String uri, Map<String, String> queryParams, Map<String, String> vars){
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		HttpEntity<?> entity = new HttpEntity<>(headers);
		
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(uri);
		for(Map.Entry<String, String> queryParam : queryParams.entrySet()){
			builder.queryParam(queryParam.getKey(), queryParam.getValue());
		}
		
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<?> response = restTemplate.exchange(builder.build().encode().toUri(),HttpMethod.GET, entity, Object.class);
		return response;
		
	}
}
