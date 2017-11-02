package com.cognizant.booking.services;

import com.cognizant.booking.dtos.BookingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.booking.client.BookingApi;
import com.cognizant.booking.dtos.DeviceInformation;
import com.cognizant.booking.dtos.RegistrationInformation;

@Service
public class BeconServiceImpl implements BeconService {

	@Autowired
	private BookingApi bookingApi;

	@Override
	public BookingResponse registerBecon(final DeviceInformation deviceInformation) {

		final RegistrationInformation registerBecon = bookingApi.registerBecon(deviceInformation);
		final BookingResponse bookingResponse = new BookingResponse();
		bookingResponse.setMessage("Becon registration status");
		bookingResponse.setSuccess(registerBecon.isRegistertered());
		return bookingResponse;
	}

}
