package com.bluesoft.rentalapplication.domain.apartment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class BookingAccepted {
    private final String eventId;
    private final LocalDateTime eventCreationDateTime;
    private final String rentalType;
    private final String rentalPlaceId;
    private final String tenantId;
    private final List<LocalDate> days;

    private BookingAccepted(
            String eventId, LocalDateTime eventCreationDateTime, String rentalType, String rentalPlaceId,
            String tenantId, List<LocalDate> days) {
        this.eventId = eventId;
        this.eventCreationDateTime = eventCreationDateTime;
        this.rentalType = rentalType;
        this.rentalPlaceId = rentalPlaceId;
        this.tenantId = tenantId;
        this.days = days;
    }

    static BookingAccepted create(RentalType rentalType, String rentalPlaceId, String tenantId, List<LocalDate> days) {
        String eventId = UUID.randomUUID().toString();
        LocalDateTime eventCreationDateTime = LocalDateTime.now();

        return new BookingAccepted(eventId, eventCreationDateTime, rentalType.name(), rentalPlaceId, tenantId, days);
    }

    String getEventId() {
        return eventId;
    }

    LocalDateTime getEventCreationDateTime() {
        return eventCreationDateTime;
    }

    String getRentalType() {
        return rentalType;
    }

    String getRentalPlaceId() {
        return rentalPlaceId;
    }

    String getTenantId() {
        return tenantId;
    }

    List<LocalDate> getDays() {
        return days;
    }
}