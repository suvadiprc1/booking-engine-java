package com.cognizant.booking.client;

import com.cognizant.booking.dtos.DeviceInformation;
import com.cognizant.booking.dtos.PointOfInterestRequest;
import com.cognizant.booking.dtos.PointOfInterestResponse;
import com.cognizant.booking.dtos.PushNotifyFCMRequest;
import com.cognizant.booking.dtos.RegistrationInformation;
import com.cognizant.booking.dtos.ReservationRequest;
import com.cognizant.booking.dtos.ReservationResponse;
import com.cognizant.booking.enums.ServiceTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class BookingApiImpl implements BookingApi {

    private static final String METHOD_NAME_BECON_REGISTER = "addBecons";
    private static final String METHOD_NAME_GET_CURRENT_AND_FUTURE_RESERVATIONS = "getCurrentandFutureReservations";
    private static final String METHOD_NAME_GET_POI = "getAllPointsOfInterest";

    @Autowired
    private BaseClient baseClient;

    @Override
    public RegistrationInformation registerBecon(final DeviceInformation deviceInformation) {
        final String url =
            BookingSupportUrlCreator.getInstance().buildRootUrl(ServiceTypes.POI, METHOD_NAME_BECON_REGISTER).build();
        return callBookingService(null, HttpMethod.POST, deviceInformation, RegistrationInformation.class, url).getResponse();
    }

    @Override
    public ReservationResponse getReservation(ReservationRequest reservationRequest) {
        final String url = BookingSupportUrlCreator.getInstance()
            .buildRootUrl(ServiceTypes.RESERVATION, METHOD_NAME_GET_CURRENT_AND_FUTURE_RESERVATIONS).build();
        return callBookingService(null, HttpMethod.POST, reservationRequest, ReservationResponse.class, url).getResponse();
    }

    @Override
    public void sendPushNotification(final PushNotifyFCMRequest pushNotifyFCMRequest) {
        final String url = "https://fcm.googleapis.com/fcm/send";
        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", "key=AAAAaOAaOj8:APA91bGRBv8MuFw_wc0rc51m"
            + "-p_eipyGs8cZCrhhUzqRga6OtL7KDiusX4nJuRjeHi6eChxltBiXOcSwXHgeSrMhhALzt3dTflx3Nor3NhEvtq-ZpbkEj5mq5_ZK1rtDfNxksX"
            + "-gpnBm");
        httpHeaders.add("Content-Type", "application/json");
        final BaseResponseWrapper<Object> objectBaseResponseWrapper =
            callBookingService(httpHeaders, HttpMethod.POST, pushNotifyFCMRequest, null, url);
        final HttpStatus httpStatus = objectBaseResponseWrapper.getHttpStatus();
        if (!HttpStatus.OK.equals(httpStatus)) {
            throw new RuntimeException("Push notification sending failed!");
        }
    }

    @Override
    public PointOfInterestResponse getPointOfInterests(PointOfInterestRequest pointOfInterestRequest) {
        final String url = BookingSupportUrlCreator.getInstance().buildRootUrl(ServiceTypes.POI, METHOD_NAME_GET_POI).build();
        return callBookingService(null, HttpMethod.POST, pointOfInterestRequest, PointOfInterestResponse.class, url).getResponse();
    }

    private <T> BaseResponseWrapper<T> callBookingService(final HttpHeaders headers, final HttpMethod httpMethod,
        final Object request, final Class<T> resp, final String url) {
        BaseResponseWrapper<T> sendRequestWrapResponse = null;
        try {
            return baseClient.sendRequestWrapResponse(headers, httpMethod, request, resp, url);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
