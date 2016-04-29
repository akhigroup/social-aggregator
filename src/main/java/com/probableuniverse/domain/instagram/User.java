package com.probableuniverse.domain.instagram;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	public String userName;
	public String bio;
	public String website;
	public String profilePicture;
	public String fullName;
	public String id;
	
	@JsonProperty("username")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@JsonProperty("bio")
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	@JsonProperty("website")
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	@JsonProperty("profile_picture")
	public String getProfilePicture() {
		return profilePicture;
	}
	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}
	@JsonProperty("full_name")
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	@JsonProperty("id")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
