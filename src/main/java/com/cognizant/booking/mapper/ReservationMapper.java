package com.cognizant.booking.mapper;

import com.cognizant.booking.dtos.PushNotificationRequest;
import com.cognizant.booking.dtos.PushNotificationResponse;
import com.cognizant.booking.dtos.ReservationRequest;
import com.cognizant.booking.dtos.ReservationResponse;
import org.springframework.stereotype.Component;

@Component
public class ReservationMapper extends BaseMapper {

    public ReservationRequest toReservationRQ(final PushNotificationRequest pushNotificationRequest) {
        return tryMapping(pushNotificationRequest, ReservationRequest.class);
    }

}
