package com.bluesoft.rentalapplication.domain.hotel;

public class Hotel {
    private final String name;
    private final Address address;

    public Hotel(final String name, final Address address) {
        this.name = name;
        this.address = address;
    }
}
