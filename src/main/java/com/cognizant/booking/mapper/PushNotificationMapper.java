package com.cognizant.booking.mapper;

import com.cognizant.booking.dtos.PointOfInterestResponse;
import com.cognizant.booking.dtos.PushNotificationRequest;
import com.cognizant.booking.dtos.PushNotificationResponse;
import com.cognizant.booking.dtos.PushNotifyFCMRequest;
import com.cognizant.booking.dtos.ReservationResponse;
import org.springframework.stereotype.Component;

@Component
public class PushNotificationMapper extends BaseMapper {

    public PushNotifyFCMRequest toPushNotificationRQ(final ReservationResponse reservationResponse,
        final PointOfInterestResponse pointOfInterestResponse, final PushNotificationRequest pushNotificationRequest) {
        final PushNotificationResponse pushNotificationResponse = tryMapping(reservationResponse, PushNotificationResponse.class);
        tryMapping(pointOfInterestResponse, pushNotificationResponse);
        tryMapping(pushNotificationRequest, pushNotificationResponse);
        pushNotificationResponse.setCallingIdentity(pushNotificationRequest.getIdentifier());
        final PushNotifyFCMRequest pushNotifyFCMRequest = new PushNotifyFCMRequest();
        pushNotifyFCMRequest.setData(pushNotificationResponse);
        tryMapping(pushNotificationRequest ,pushNotifyFCMRequest);
        return pushNotifyFCMRequest;
    }
}
