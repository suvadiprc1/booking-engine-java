package com.cognizant.booking.services;

import com.cognizant.booking.client.BookingApi;
import com.cognizant.booking.dtos.PointOfInterestRequest;
import com.cognizant.booking.dtos.PointOfInterestResponse;
import com.cognizant.booking.dtos.PushNotificationRequest;
import com.cognizant.booking.dtos.PushNotifyFCMRequest;
import com.cognizant.booking.dtos.ReservationRequest;
import com.cognizant.booking.dtos.ReservationResponse;
import com.cognizant.booking.mapper.POIMapper;
import com.cognizant.booking.mapper.PushNotificationMapper;
import com.cognizant.booking.mapper.ReservationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationInformationServiceImpl implements ReservationInformationService {

    @Autowired
    private ReservationMapper reservationMapper;
    @Autowired
    private POIMapper poiMapper;
    @Autowired
    private PushNotificationMapper pushNotificationMapper;
    @Autowired
    private BookingApi bookingApi;
    @Autowired
    private PointOfInterestService pointOfInterestService;

    @Override
    public void getReservationInformation(final PushNotificationRequest pushNotificationRequest) {
        final ReservationRequest reservationRequest = reservationMapper.toReservationRQ(pushNotificationRequest);
        final ReservationResponse reservationResponse = bookingApi.getReservation(reservationRequest);
        final PointOfInterestRequest pointOfInterestRequest = poiMapper.toPoi(pushNotificationRequest);
        final PointOfInterestResponse pointOfInterestResponse = pointOfInterestService.getPointOfInterests(pointOfInterestRequest);

        // Call push notification service with reservation data
        final PushNotifyFCMRequest pushNotifyFCMRequest =
            pushNotificationMapper.toPushNotificationRQ(reservationResponse, pointOfInterestResponse, pushNotificationRequest);
        bookingApi.sendPushNotification(pushNotifyFCMRequest);
    }
}

