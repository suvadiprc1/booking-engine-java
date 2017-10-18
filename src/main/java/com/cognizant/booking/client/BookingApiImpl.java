package com.cognizant.booking.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

import com.cognizant.booking.dtos.DeviceInformation;
import com.cognizant.booking.dtos.RegistrationInformation;
import com.cognizant.booking.enums.ServiceTypes;

@Component
public class BookingApiImpl implements BookingApi {

	private static final String METHOD_NAME_BECON_REGISTER = "registerDevice";

	@Autowired
	private BaseClient baseClient;

	@Override
	public RegistrationInformation registerBecon(final DeviceInformation deviceInformation) {
		final String url = BookingSupportUrlCreator.getInstance()
				.buildRootUrl(ServiceTypes.BECON_REGISTER, METHOD_NAME_BECON_REGISTER).build();
		return callBookingService(null, HttpMethod.POST, deviceInformation, RegistrationInformation.class, url);
	}

	private <T> T callBookingService(final HttpHeaders headers, final HttpMethod httpMethod, final Object request,
			final Class<T> resp, final String url) {
		BaseResponseWrapper<T> sendRequestWrapResponse = null;
		try {
			sendRequestWrapResponse = baseClient.sendRequestWrapResponse(headers, httpMethod, request, resp, url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return sendRequestWrapResponse.getResponse();
	}

}
