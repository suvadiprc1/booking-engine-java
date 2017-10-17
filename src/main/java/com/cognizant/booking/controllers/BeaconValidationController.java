package com.cognizant.booking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.booking.services.BeaconValidationService;

@RestController
public class BeaconValidationController {

	@Autowired
	private BeaconValidationService beaconValidationService;

	@RequestMapping("/api/validateBecon")
	public boolean validateBecon(@RequestParam final String beconId) {
		return beaconValidationService.validate(beconId);
	}

}
