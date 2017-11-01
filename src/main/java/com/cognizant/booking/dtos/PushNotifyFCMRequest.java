package com.cognizant.booking.dtos;

import org.dozer.Mapping;

import java.io.Serializable;

public class PushNotifyFCMRequest implements Serializable {

	@Mapping("token")
	private String to;
	private PushNotificationResponse data;
	
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public PushNotificationResponse getData() {
		return data;
	}
	public void setData(PushNotificationResponse data) {
		this.data = data;
	}
	
}
