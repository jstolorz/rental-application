package com.bluesoft.rentalapplication.domain.hotelroom;

import javax.persistence.Embeddable;


class Space {
    private final String name;
    private final SquareMeter squareMeter;

    Space(final String name, final SquareMeter squareMeter) {
        this.name = name;
        this.squareMeter = squareMeter;
    }
}
