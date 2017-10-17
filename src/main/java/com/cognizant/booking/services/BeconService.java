package com.cognizant.booking.services;

import com.cognizant.booking.dtos.DeviceInformation;

public interface BeconService {

	boolean registerBecon(DeviceInformation deviceInformation);

}
