package com.bluesoft.rentalapplication.domain.apartmentbookinghistory;

import java.util.ArrayList;
import java.util.List;

public class ApartmentBookingHistory {
    private String apartmentId;
    private final List<ApartmentBooking> bookings = new ArrayList<>();

    public ApartmentBookingHistory(final String apartmentId) {
        this.apartmentId = apartmentId;
    }

    public void add(final ApartmentBooking apartmentBooking) {
       bookings.add(apartmentBooking);
    }
}
