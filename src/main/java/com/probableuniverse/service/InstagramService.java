package com.probableuniverse.service;

import com.probableuniverse.domain.instagram.AccessToken;
import com.probableuniverse.domain.instagram.users.UserEnvelope;

public interface InstagramService {

	public AccessToken getAccessToken(String code);
	public UserEnvelope getUserSelf(String accessToken);
	public UserEnvelope getUserById(String userId, String accessToken);
}
