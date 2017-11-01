package com.cognizant.booking.dtos;

import org.dozer.Mapping;

import java.io.Serializable;

public class PushNotificationRequest implements Serializable {

	private String memberId;
    private String deviceId;
    private Double latitude;
    private Double longitude;
    private String identifier;
    private String token;
    private String vehicleNo;
    private String vehLandmarkInstructions;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

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
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getVehLandmarkInstructions() {
		return vehLandmarkInstructions;
	}

	public void setVehLandmarkInstructions(String vehLandmarkInstructions) {
		this.vehLandmarkInstructions = vehLandmarkInstructions;
	}
}
