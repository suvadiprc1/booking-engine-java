package com.cognizant.booking.dtos;

import java.io.Serializable;

public class PointOfInterest implements Serializable {

	private String name;
	private PromotionalOffer promotionalOffers;
	private Distance driveDistanceDetails;
	private String specialInstructions;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PromotionalOffer getPromotionalOffers() {
		return promotionalOffers;
	}

	public void setPromotionalOffers(PromotionalOffer promotionalOffers) {
		this.promotionalOffers = promotionalOffers;
	}

	public Distance getDriveDistanceDetails() {
		return driveDistanceDetails;
	}

	public void setDriveDistanceDetails(Distance driveDistanceDetails) {
		this.driveDistanceDetails = driveDistanceDetails;
	}

	public String getSpecialInstructions() {
		return specialInstructions;
	}

	public void setSpecialInstructions(String specialInstructions) {
		this.specialInstructions = specialInstructions;
	}
}
