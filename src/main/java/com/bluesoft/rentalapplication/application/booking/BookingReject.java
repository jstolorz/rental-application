package com.bluesoft.rentalapplication.application.booking;

public class BookingReject {
    private String bookingId;

    public BookingReject(final String id) {
        this.bookingId = id;
    }

    String getBookingId() {
        return bookingId;
    }
}
