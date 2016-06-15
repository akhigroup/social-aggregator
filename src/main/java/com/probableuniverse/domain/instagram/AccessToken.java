package com.probableuniverse.domain.instagram;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.probableuniverse.domain.instagram.users.User;

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
