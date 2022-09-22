package com.bluesoft.rentalapplication.domain.apartment;

public class Apartment {
    private final String ownerId;
    private final Address address;
    private final String description;

    Apartment(final String ownerId, final Address address, final String description) {

        this.ownerId = ownerId;
        this.address = address;
        this.description = description;
    }
}
