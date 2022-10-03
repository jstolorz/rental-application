package com.bluesoft.rentalapplication.domain.hotelroom;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class HotelRoomBooked {
    private final String eventId;
    private final LocalDateTime eventCreationDateTime;
    private final String hotelRoomId;
    private final String hotelId;
    private final String tenantId;
    private final List<LocalDate> days;

    private HotelRoomBooked(final String eventId, final LocalDateTime eventCreationDateTime, final String hotelRoomId, final String hotelId, final String tenantId, final List<LocalDate> days) {

        this.eventId = eventId;
        this.eventCreationDateTime = eventCreationDateTime;
        this.hotelRoomId = hotelRoomId;
        this.hotelId = hotelId;
        this.tenantId = tenantId;
        this.days = days;
    }

    static HotelRoomBooked create(final String hotelRoomId, final String hotelId, final String tenantId, final List<LocalDate> days) {
        String eventId = UUID.randomUUID().toString();
        LocalDateTime eventCreationDateTime = LocalDateTime.now();

        return new HotelRoomBooked(eventId, eventCreationDateTime, hotelRoomId, hotelId, tenantId, days);
    }

    public String getEventId() {
        return eventId;
    }

    public LocalDateTime getEventCreationDateTime() {
        return eventCreationDateTime;
    }

    public String getHotelRoomId() {
        return hotelRoomId;
    }

    public String getHotelId() {
        return hotelId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public List<LocalDate> getDays() {
        return days;
    }
}
