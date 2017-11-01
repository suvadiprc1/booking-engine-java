package com.cognizant.booking.client;

import com.cognizant.booking.dtos.DeviceInformation;
import com.cognizant.booking.dtos.PointOfInterestRequest;
import com.cognizant.booking.dtos.PointOfInterestResponse;
import com.cognizant.booking.dtos.PushNotifyFCMRequest;
import com.cognizant.booking.dtos.RegistrationInformation;
import com.cognizant.booking.dtos.ReservationRequest;
import com.cognizant.booking.dtos.ReservationResponse;

public interface BookingApi {

	RegistrationInformation registerBecon(DeviceInformation deviceInformation);

	ReservationResponse getReservation(ReservationRequest reservationRequest);

	void sendPushNotification(PushNotifyFCMRequest pushNotifyFCMRequest);

	PointOfInterestResponse getPointOfInterests(PointOfInterestRequest pointOfInterestRequest);


}
