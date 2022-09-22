package com.bluesoft.rentalapplication.domain.apartment;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
class Room {
    private final String name;

    @Embedded
    private final SquareMeter squareMeter;

    Room(final String name, final SquareMeter squerMeter) {

        this.name = name;
        this.squareMeter = squerMeter;
    }
}
