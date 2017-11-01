package com.cognizant.booking.mapper;

import com.cognizant.booking.dtos.Location;
import com.cognizant.booking.dtos.PointOfInterestRequest;
import com.cognizant.booking.dtos.PushNotificationRequest;
import org.springframework.stereotype.Component;

@Component
public class POIMapper extends BaseMapper {

    public PointOfInterestRequest toPoi(final PushNotificationRequest pushNotificationRequest) {
        final Location location = tryMapping(pushNotificationRequest, Location.class);
        final PointOfInterestRequest pointOfInterestRequest = new PointOfInterestRequest();
        pointOfInterestRequest.setLocation(location);
        return pointOfInterestRequest;
    }
}
