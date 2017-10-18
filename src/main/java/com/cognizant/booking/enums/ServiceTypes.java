package com.cognizant.booking.enums;

public enum ServiceTypes {
	POI("booking-engine-poi", "info"), RESERVATION("booking-engine-reservation",
			"info"), BECON_INFO("booking-engine-becon", "info"), BECON_REGISTER("booking-engine-becon", "register");

	private String serviceType;
	private String serviceCategory;

	private ServiceTypes(String serviceType, String serviceCategory) {
		this.serviceType = serviceType;
		this.serviceCategory = serviceCategory;
	}

	public String getServiceType() {
		return serviceType;
	}

	public String getServiceCategory() {
		return serviceCategory;
	}

}
