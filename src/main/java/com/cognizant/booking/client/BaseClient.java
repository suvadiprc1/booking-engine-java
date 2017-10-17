package com.cognizant.booking.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BaseClient {

	@Autowired
	private RestTemplate restTemplate;

	public <T> BaseResponseWrapper<T> sendRequestWrapResponse(final HttpHeaders headers, final HttpMethod httpMethod,
			final Object requestObject, final Class<T> responseType, final String url) {
		BaseResponseWrapper<T> baseResponseWrapper = null;
		final ResponseEntity<T> responseEntity = getResponseEntity(headers, httpMethod, requestObject, responseType,
				url);
		baseResponseWrapper = new BaseResponseWrapper<T>(responseEntity.getStatusCode(), responseEntity.getBody());
		return baseResponseWrapper;
	}

	private <T> ResponseEntity<T> getResponseEntity(final HttpHeaders headers, final HttpMethod httpMethod,
			final Object requestObject, final Class<T> responseType, final String url) {
		final HttpEntity<?> requestEntity = new HttpEntity(requestObject, headers);
		return restTemplate.exchange(url, httpMethod, requestEntity, responseType);
	}

}
