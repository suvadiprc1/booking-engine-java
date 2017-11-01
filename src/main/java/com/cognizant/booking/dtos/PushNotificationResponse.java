package com.cognizant.booking.dtos;

import java.io.Serializable;
import java.util.List;

public class PushNotificationResponse implements Serializable {

	private String memberId;
	private List<Reservation> reservations;
	private List<PointOfInterest> poi;
	private String callingIdentity;
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public List<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	public List<PointOfInterest> getPoi() {
		return poi;
	}
	public void setPoi(List<PointOfInterest> poi) {
		this.poi = poi;
	}
	public String getCallingIdentity() {
		return callingIdentity;
	}
	public void setCallingIdentity(String callingIdentity) {
		this.callingIdentity = callingIdentity;
	}
	
}
