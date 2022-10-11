package com.bluesoft.rentalapplication.application.commandregistry;

import com.bluesoft.rentalapplication.application.booking.BookingReject;

public interface CommandRegister {
    void register(BookingReject bookingReject);

}
