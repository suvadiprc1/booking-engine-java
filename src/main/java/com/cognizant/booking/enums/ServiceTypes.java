package com.cognizant.booking.enums;

public enum ServiceTypes {
	POI("booking-engine-poi"), RESRVATION("booking-engine-reservation"), BECON("booking-engine-becon");

	private String serviceType;

	private ServiceTypes(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getServiceType() {
		return serviceType;
	}

}
