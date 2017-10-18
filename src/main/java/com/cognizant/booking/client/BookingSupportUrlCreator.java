package com.cognizant.booking.client;

import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.booking.ApplicationProperties;
import com.cognizant.booking.enums.ServiceTypes;

public final class BookingSupportUrlCreator {

	private BookingSupportUrlCreator() {
	}

	public static Builder getInstance() {
		return new BookingSupportUrlCreator.Builder();
	}

	protected static class Builder {

		private String url;

		@Autowired
		private ApplicationProperties applicationProperties;

		private Builder() {
			this.url = applicationProperties.getServices().getRootUrl();
		}

		public String build() {
			if (this.url.endsWith("&")) {
				this.url = this.url.substring(0, this.url.length() - 1);
			}
			return this.url;
		}

		Builder buildRootUrl(final ServiceTypes serviceTypes, final String methodName) {
			this.url = String.format(this.url, serviceTypes.getServiceType(), serviceTypes.getServiceCategory(),
					methodName);
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
