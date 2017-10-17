package com.cognizant.booking.client;

import com.cognizant.booking.dtos.DeviceInformation;
import com.cognizant.booking.dtos.RegistrationInformation;

public interface BookingApi {

	RegistrationInformation registerBecon(DeviceInformation deviceInformation);

}
