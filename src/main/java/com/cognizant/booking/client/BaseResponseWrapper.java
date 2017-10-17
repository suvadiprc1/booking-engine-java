package com.cognizant.booking.client;

import org.springframework.http.HttpStatus;

public class BaseResponseWrapper<T> {

	private HttpStatus httpStatus;
	private T response;

	public BaseResponseWrapper(HttpStatus httpStatus, T response) {
		super();
		this.httpStatus = httpStatus;
		this.response = response;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public T getResponse() {
		return response;
	}

	public void setResponse(T response) {
		this.response = response;
	}

}
