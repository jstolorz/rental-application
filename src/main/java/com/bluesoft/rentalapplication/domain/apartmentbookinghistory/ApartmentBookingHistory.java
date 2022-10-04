package com.bluesoft.rentalapplication.domain.apartmentbookinghistory;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ApartmentBookingHistory {
    @Id
    private String apartmentId;

    @OneToMany
    private final List<ApartmentBooking> bookings = new ArrayList<>();

    public ApartmentBookingHistory(final String apartmentId) {
        this.apartmentId = apartmentId;
    }

    public void add(final ApartmentBooking apartmentBooking) {
       bookings.add(apartmentBooking);
    }
}
