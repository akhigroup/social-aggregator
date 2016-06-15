package com.probableuniverse.service;

import com.probableuniverse.domain.instagram.AccessToken;
import com.probableuniverse.domain.instagram.InstagramEnvelope;

public interface InstagramService {

	public AccessToken getAccessToken(String code);
	public InstagramEnvelope getUsersSelf(String accessToken);
}
