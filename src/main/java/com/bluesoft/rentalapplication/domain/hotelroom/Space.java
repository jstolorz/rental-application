package com.bluesoft.rentalapplication.domain.hotelroom;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
class Space {
    private final String name;

    @Embedded
    private final SquareMeter squareMeter;

    Space(final String name, final SquareMeter squareMeter) {
        this.name = name;
        this.squareMeter = squareMeter;
    }
}
