package com.cognizant.booking.dtos;

import org.dozer.Mapping;

import java.io.Serializable;
import java.util.List;

public class PointOfInterestResponse implements Serializable {
    @Mapping("poi")
    private List<PointOfInterest> pointOfInterests;

    public List<PointOfInterest> getPointOfInterests() {
        return pointOfInterests;
    }

    public void setPointOfInterests(List<PointOfInterest> pointOfInterests) {
        this.pointOfInterests = pointOfInterests;
    }
}
