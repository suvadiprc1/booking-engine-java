package com.cognizant.booking.dtos;

import java.io.Serializable;
import java.util.List;

public class ReservationResponse implements Serializable {

    private List<Reservation> reservations;

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
