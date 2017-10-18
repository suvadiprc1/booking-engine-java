package com.cognizant.booking;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "booking")
public class ApplicationProperties {
	private Services services;

	public Services getServices() {
		return services;
	}

	public void setServices(Services services) {
		this.services = services;
	}

	public static class Services {
		private String rootUrl;

		public String getRootUrl() {
			return rootUrl;
		}

		public void setRootUrl(String rootUrl) {
			this.rootUrl = rootUrl;
		}

	}

}
