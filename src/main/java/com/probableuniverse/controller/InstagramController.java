package com.probableuniverse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.probableuniverse.domain.instagram.AccessToken;
import com.probableuniverse.domain.instagram.users.UserEnvelope;
import com.probableuniverse.service.InstagramService;

@RestController
public class InstagramController {

	@Autowired
	InstagramService instagramService;
	
/*	
 * TODO:Might be useful to use this as a "gateway" before requesting the code from instagram, 
 * 		in that case you'll use an oAuth redirect app that this app will redirect to.
 * 
 * @RequestMapping("/get-instagram-access-token")
	public AccessToken getAccessToken(){
		return instagramService.getAccessToken();
	}
*/
	
	/**
	 * This assumes the request is coming from instagram with the code needed for the access token.
	 * 
	 * @param code
	 * @return accessToken
	 */
	@RequestMapping("/instagram-callback")
	public AccessToken instagramCallback(String code){
		AccessToken accessToken = instagramService.getAccessToken(code);
		return accessToken;
	}
	
	@RequestMapping("/instagram/user-self")
	public UserEnvelope userSelf(
			@RequestParam(value="access-token", required=true) String accessToken){
		UserEnvelope userEnvelope = instagramService.getUserSelf(accessToken);
		return userEnvelope;
	}
	
	@RequestMapping("/instagram/user/{user-id}")
	public UserEnvelope userById(
			@PathVariable("user-id") String userId,
			@RequestParam(value="access-token", required=true) String accessToken){
		UserEnvelope userEnvelope = instagramService.getUserById(userId,accessToken);
		return userEnvelope;	
	}
	
}
