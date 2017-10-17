package com.cognizant.booking.client;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

public class BookingQuery {

	private String url;
	private String methodName;
	private HttpHeaders httpHeaders;
	private HttpMethod httpMethod;
	
	

	public BookingQuery(String url, String methodName, HttpHeaders httpHeaders, HttpMethod httpMethod) {
		super();
		this.url = url;
		this.methodName = methodName;
		this.httpHeaders = httpHeaders;
		this.httpMethod = httpMethod;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public HttpHeaders getHttpHeaders() {
		return httpHeaders;
	}

	public void setHttpHeaders(HttpHeaders httpHeaders) {
		this.httpHeaders = httpHeaders;
	}

	public HttpMethod getHttpMethod() {
		return httpMethod;
	}

	public void setHttpMethod(HttpMethod httpMethod) {
		this.httpMethod = httpMethod;
	}

}
