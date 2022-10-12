package com.bluesoft.rentalapplication.domain.apartment;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Booking {

    private final RentalType apartment;
    @Id
    @GeneratedValue
    private String id;
    private final String tenantId;
    private final List<LocalDate> days;
    private BookingStatus bookingStatus = BookingStatus.OPEN;


    public Booking(final RentalType apartment, final String rentalPlaceId, final String tenantId, final List<LocalDate> days) {

        this.apartment = apartment;
        id = rentalPlaceId;
        this.tenantId = tenantId;
        this.days = days;
    }

    static Booking apartment(final String rentalPlaceId, final String tenantId, final Period period) {
        List<LocalDate> days = period.asDays(period);
        return new Booking(RentalType.APARTMENT, rentalPlaceId,tenantId,days);
    }


    public static Booking hotelRoom(final String rentalPlaceId, final String tenantId, final List<LocalDate> days) {
        return new Booking(RentalType.HOTEL_ROOM, rentalPlaceId,tenantId,days);
    }

    public void reject() {
       this.bookingStatus = BookingStatus.REJECTED;
    }
}
