package com.cognizant.booking.dtos;

import java.io.Serializable;

public class Distance implements Serializable {

	private Double latitude;
	private Double longitude;
	private Double driveDistance;
	private String landMarkInstructions;
	
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getDriveDistance() {
		return driveDistance;
	}
	public void setDriveDistance(Double driveDistance) {
		this.driveDistance = driveDistance;
	}
	public String getLandMarkInstructions() {
		return landMarkInstructions;
	}
	public void setLandMarkInstructions(String landMarkInstructions) {
		this.landMarkInstructions = landMarkInstructions;
	}
}
