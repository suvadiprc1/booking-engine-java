package com.cognizant.booking.services;

import com.cognizant.booking.client.BookingApi;
import com.cognizant.booking.dtos.PointOfInterestRequest;
import com.cognizant.booking.dtos.PointOfInterestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PointOfInterestServiceImpl implements PointOfInterestService {
    @Autowired
    private BookingApi bookingApi;

    @Override
    public PointOfInterestResponse getPointOfInterests(PointOfInterestRequest pointOfInterestRequest) {
        return bookingApi.getPointOfInterests(pointOfInterestRequest);
    }
}
