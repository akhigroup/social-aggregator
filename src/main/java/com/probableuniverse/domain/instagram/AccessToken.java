package com.probableuniverse.domain.instagram;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccessToken {

	public String accessToken;
	public User user = new User();
	
	@JsonProperty("access_token")
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	@JsonProperty("user")
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
