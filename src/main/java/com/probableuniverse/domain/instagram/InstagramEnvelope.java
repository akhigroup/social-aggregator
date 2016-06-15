package com.probableuniverse.domain.instagram;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InstagramEnvelope {
	public Meta meta;
	public Pagination pagination;

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
	
}
