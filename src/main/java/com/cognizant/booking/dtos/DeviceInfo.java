package com.cognizant.booking.dtos;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DeviceInfo implements Serializable {

	private String uuid;
	private String region;
	private String assetId;
	private String message;
	private String longitude;
	private String latitude;
	private String locationDetails;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getAssetId() {
		return assetId;
	}

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLocationDetails() {
		return locationDetails;
	}

	public void setLocationDetails(String locationDetails) {
		this.locationDetails = locationDetails;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!DeviceInfo.class.isAssignableFrom(obj.getClass())) {
			return false;
		}
		final DeviceInfo other = (DeviceInfo) obj;
		if ((this.uuid == null) ? (other.uuid != null) : !this.uuid.equals(other.uuid)) {
			return false;
		}
		if ((this.region == null) ? (other.region != null) : !this.region.equals(other.region)) {
			return false;
		}
		if ((this.assetId == null) ? (other.assetId != null) : !this.assetId.equals(other.assetId)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		return Integer.MIN_VALUE;
	}

}
