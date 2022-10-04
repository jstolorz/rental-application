package com.bluesoft.rentalapplication.domain.apartmentbookinghistory;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import java.time.LocalDateTime;
@Entity
public class ApartmentBooking {

    private final BookingStep start;
    private LocalDateTime bookingDateTime;
    private final String ownerId;
    private final String tenantId;

    @Embedded
    private final BookingPeriod bookingPeriod;

    public ApartmentBooking(final BookingStep start, final LocalDateTime bookingDateTime, final String ownerId, final String tenantId, final BookingPeriod bookingPeriod) {

        this.start = start;
        this.bookingDateTime = bookingDateTime;
        this.ownerId = ownerId;
        this.tenantId = tenantId;
        this.bookingPeriod = bookingPeriod;
    }

    public static ApartmentBooking start(final LocalDateTime bookingDateTime, final String ownerId, final String tenantId, final BookingPeriod bookingPeriod) {
        return new ApartmentBooking(BookingStep.START,bookingDateTime, ownerId,tenantId,bookingPeriod);
    }
}
