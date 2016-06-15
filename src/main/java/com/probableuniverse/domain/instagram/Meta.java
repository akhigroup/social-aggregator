package com.probableuniverse.domain.instagram;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meta {
	public String errorType;
	public String code;
	public String errorMessage;
	
	@JsonProperty("error_type")
	public String getErrorType() {
		return errorType;
	}
	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}
	@JsonProperty("code")
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@JsonProperty("error_message")
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
