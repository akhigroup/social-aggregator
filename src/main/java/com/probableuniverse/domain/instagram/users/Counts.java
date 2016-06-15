package com.probableuniverse.domain.instagram.users;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Counts {
	
	public String media;
	public String follows;
	public String followedBy;
	
	@JsonProperty("media")
	public String getMedia() {
		return media;
	}
	public void setMedia(String media) {
		this.media = media;
	}
	
	@JsonProperty("follows")
	public String getFollows() {
		return follows;
	}
	public void setFollows(String follows) {
		this.follows = follows;
	}
	
	@JsonProperty("followed_by")
	public String getFollowedBy() {
		return followedBy;
	}
	public void setFollowedBy(String followedBy) {
		this.followedBy = followedBy;
	}

}
