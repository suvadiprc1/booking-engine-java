package com.cognizant.booking.controllers;

import com.cognizant.booking.dtos.PushNotificationRequest;
import com.cognizant.booking.services.ReservationInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationInformationController {

    @Autowired
    private ReservationInformationService reservationInformationService;

    @RequestMapping("/service/api/booking/notify/info")
    public void sendReservationInformation(@RequestBody final PushNotificationRequest pushNotificationRequest) {
        reservationInformationService.getReservationInformation(pushNotificationRequest);
    }
}
