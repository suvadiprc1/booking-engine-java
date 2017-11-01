package com.cognizant.booking.dtos;

import java.io.Serializable;

public class Reservation implements Serializable {

	private String reservationId;
	private Double startDateTime;
	private Double endDateTime;
	private String category;
	private Double bookingPrice;
	private String companyName;
	private String companyWebsite;
	private PromotionalOffer promoOffers;
	private Distance driveDistance;
	private String specialInstructions;
	private String vehicleNo;
	
	public String getReservationId() {
		return reservationId;
	}
	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}
	public Double getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(Double startDateTime) {
		this.startDateTime = startDateTime;
	}
	public Double getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(Double endDateTime) {
		this.endDateTime = endDateTime;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getBookingPrice() {
		return bookingPrice;
	}
	public void setBookingPrice(Double bookingPrice) {
		this.bookingPrice = bookingPrice;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyWebsite() {
		return companyWebsite;
	}
	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
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
	
	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
}
