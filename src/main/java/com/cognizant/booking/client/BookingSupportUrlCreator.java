package com.cognizant.booking.client;

import org.springframework.beans.factory.annotation.Value;

import com.cognizant.booking.enums.ServiceTypes;

public class BookingSupportUrlCreator {

	private BookingSupportUrlCreator() {
	}

	public static Builder getInstance() {
		return new BookingSupportUrlCreator.Builder();
	}

	protected static class Builder {

		@Value("${support.service.root.url}")
		private String url;

		@Value("${support.service.url.api.info}")
		private String apiInfo;

		private Builder() {
		}

		public String build() {
			if (this.url.endsWith("&")) {
				this.url = this.url.substring(0, this.url.length() - 1);
			}
			return this.url;
		}

		Builder addServiceType(final ServiceTypes serviceTypes) {
			this.url = this.url.concat("/").concat(serviceTypes.getServiceType()).concat(apiInfo);
			return this;
		}

		Builder addMethodName(final String methodName) {
			this.url = this.url.concat(methodName);
			return this;
		}

		Builder addQueryParam(final String key, final String value) {
			if (!this.url.contains("?")) {
				this.url = this.url.concat("?");
			}
			this.url = this.url.concat(key).concat("=").concat(value).concat("&");
			return this;
		}

		Builder addPathVariable(final String key, final String value) {
			this.url = this.url.concat("/").concat(key).concat("/").concat(value);
			return this;
		}

	}

}
