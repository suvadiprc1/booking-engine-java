package com.cognizant.booking.dtos;

import java.io.Serializable;

public class PointOfInterestRequest implements Serializable {

    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

}
