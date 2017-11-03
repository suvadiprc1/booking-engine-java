package com.cognizant.booking.controllers;

import com.cognizant.booking.dtos.BookingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.booking.dtos.DeviceInformation;
import com.cognizant.booking.services.BeconService;

@RestController
public class BeconController {

    @Autowired
    private BeconService beconService;

    @RequestMapping(value = "/info/booking/device/registerDevice", method = RequestMethod.POST)
    public BookingResponse registerBecons(@RequestBody final DeviceInformation deviceInformation) {
        return beconService.registerBecon(deviceInformation);
    }

    @RequestMapping("/api/booking/device/info")
    public BookingResponse validateBecon(@RequestParam final String assetId, @RequestParam final String region,
        @RequestParam final String uuid) {
        return beconService.validate(assetId, region, uuid);
    }

}
