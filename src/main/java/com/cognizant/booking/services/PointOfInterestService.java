package com.cognizant.booking.services;

import com.cognizant.booking.dtos.PointOfInterestRequest;
import com.cognizant.booking.dtos.PointOfInterestResponse;

public interface PointOfInterestService {
    PointOfInterestResponse getPointOfInterests(PointOfInterestRequest pointOfInterestRequest);

}
