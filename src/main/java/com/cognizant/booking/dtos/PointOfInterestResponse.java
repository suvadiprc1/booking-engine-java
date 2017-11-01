package com.cognizant.booking.dtos;

import org.dozer.Mapping;

import java.util.List;

public class PointOfInterestResponse {
    @Mapping("poi")
    private List<PointOfInterest> pointsOfInterest;

    public List<PointOfInterest> getPointOfInterests() {
        return pointsOfInterest;
    }

    public void setPointOfInterests(List<PointOfInterest> pointOfInterests) {
        this.pointsOfInterest = pointOfInterests;
    }

}
