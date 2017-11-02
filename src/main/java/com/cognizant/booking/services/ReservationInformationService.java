package com.cognizant.booking.services;

import com.cognizant.booking.dtos.BookingResponse;
import com.cognizant.booking.dtos.PushNotificationRequest;

public interface ReservationInformationService {

    BookingResponse getReservationInformation(PushNotificationRequest pushNotificationRequest);
}
