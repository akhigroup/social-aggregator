package com.probableuniverse.domain.instagram.users;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.probableuniverse.domain.instagram.Meta;
import com.probableuniverse.domain.instagram.Pagination;

public class UserEnvelope {
	public Meta meta;
	public Pagination pagination;
	public User user;

	@JsonProperty("meta")
	public Meta getMeta() {
		return meta;
	}
	public void setMeta(Meta meta) {
		this.meta = meta;
	}
	@JsonProperty("pagination")
	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}
	@JsonProperty("data")
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
