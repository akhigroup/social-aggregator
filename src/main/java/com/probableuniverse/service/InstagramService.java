package com.probableuniverse.service;

import com.probableuniverse.domain.instagram.AccessToken;

public interface InstagramService {

	public AccessToken getAccessToken(String code);
	
}
