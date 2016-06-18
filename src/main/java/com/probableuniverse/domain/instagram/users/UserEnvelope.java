package com.probableuniverse.domain.instagram.users;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.probableuniverse.domain.instagram.InstagramEnvelope;

public class UserEnvelope extends InstagramEnvelope {
	public User user;

	@JsonProperty("data")
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
