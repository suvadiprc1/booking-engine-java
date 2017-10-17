package com.cognizant.booking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.booking.dtos.DeviceInformation;
import com.cognizant.booking.services.BeconService;

@RestController
public class BeconController {

	@Autowired
	private BeconService beconService;

	@RequestMapping("/api/booking/device/register")
	public boolean registerBecons(@RequestBody final DeviceInformation deviceInformation) {
		return beconService.registerBecon(deviceInformation);
	}

}
