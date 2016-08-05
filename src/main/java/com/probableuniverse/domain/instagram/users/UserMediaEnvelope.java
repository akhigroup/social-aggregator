package com.probableuniverse.domain.instagram.users;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.probableuniverse.domain.instagram.InstagramEnvelope;

public class UserMediaEnvelope extends InstagramEnvelope{
	public UserMedia userMedia;

	@JsonProperty("data")
	public UserMedia getUserMedia() {
		return userMedia;
	}

	public void setUserMedia(UserMedia userMedia) {
		this.userMedia = userMedia;
	}

	@Override
	public String toString() {
		return "UserMediaEnvelope [userMedia=" + userMedia + "]";
	}
}
