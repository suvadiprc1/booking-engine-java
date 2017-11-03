package com.cognizant.booking.services;

import com.cognizant.booking.dtos.BookingResponse;
import com.cognizant.booking.dtos.DeviceInformation;

public interface BeconService {

    BookingResponse registerBecon(DeviceInformation deviceInformation);

    BookingResponse validate(String beaconId, String regionId, String uuid);

}
