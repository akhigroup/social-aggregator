package com.probableuniverse.domain.instagram;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pagination {
	public String nextUrl;
	public String nextMaxId;
	
	@JsonProperty("next_url")
	public String getNextUrl() {
		return nextUrl;
	}
	public void setNextUrl(String nextUrl) {
		this.nextUrl = nextUrl;
	}
	@JsonProperty("next_max_id")
	public String getNextMaxId() {
		return nextMaxId;
	}
	public void setNextMaxId(String nextMaxId) {
		this.nextMaxId = nextMaxId;
	}
	
}
