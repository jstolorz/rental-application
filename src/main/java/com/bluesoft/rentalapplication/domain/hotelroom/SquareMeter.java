package com.bluesoft.rentalapplication.domain.hotelroom;

import javax.persistence.Embeddable;

@Embeddable
class SquareMeter {
    private Double value;

    SquareMeter(final Double value) {
        this.value = value;
    }
}
