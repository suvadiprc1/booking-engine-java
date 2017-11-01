package com.cognizant.booking.dtos;

import java.io.Serializable;

public class PointOfInterest implements Serializable {

	private String name;
	private PromotionalOffer promoOffers;
	private Distance driveDistance;
	private String specialInstructions;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PromotionalOffer getPromoOffers() {
		return promoOffers;
	}
	public void setPromoOffers(PromotionalOffer promoOffers) {
		this.promoOffers = promoOffers;
	}
	public Distance getDriveDistance() {
		return driveDistance;
	}
	public void setDriveDistance(Distance driveDistance) {
		this.driveDistance = driveDistance;
	}
	public String getSpecialInstructions() {
		return specialInstructions;
	}
	public void setSpecialInstructions(String specialInstructions) {
		this.specialInstructions = specialInstructions;
	}
	
}
