package com.bluesoft.rentalapplication.domain.apartment;

import java.util.List;

public class Apartment {
    private final String ownerId;
    private final Address address;
    private List<Room> rooms;
    private final String description;

    Apartment(final String ownerId, final Address address, final List<Room> rooms, final String description) {

        this.ownerId = ownerId;
        this.address = address;
        this.rooms = rooms;
        this.description = description;
    }
}
