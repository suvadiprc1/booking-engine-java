package com.cognizant.booking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.booking.client.BookingApi;

@Service
public class BeaconValidationServiceImpl implements BeaconValidationService {
	
	@Autowired
	private BookingApi bookingApi;

	@Override
	public boolean validate(final String beaconId) {
		return false;
	}

}
