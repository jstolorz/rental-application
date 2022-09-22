package com.bluesoft.rentalapplication.domain.hotelroom;

import java.util.List;

public class HotelRoom {
    private final String hotelId;
    private final int number;
    private final List<Space> spaces;
    private final String description;

    HotelRoom(final String hotelId, final int number, final List<Space> spaces, final String description) {

        this.hotelId = hotelId;
        this.number = number;
        this.spaces = spaces;
        this.description = description;
    }
}
