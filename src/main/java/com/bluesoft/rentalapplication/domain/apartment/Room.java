package com.bluesoft.rentalapplication.domain.apartment;

class Room {
    private final String name;
    private final SquareMeter squareMeter;

    Room(final String name, final SquareMeter squerMeter) {

        this.name = name;
        this.squareMeter = squerMeter;
    }
}
