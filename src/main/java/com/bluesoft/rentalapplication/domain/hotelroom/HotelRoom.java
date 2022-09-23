package com.bluesoft.rentalapplication.domain.hotelroom;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class HotelRoom {

    @Id
    @GeneratedValue
    private final String hotelId;
    private final int number;

    @OneToMany
    private final List<Space> spaces;
    private final String description;

    HotelRoom(final String hotelId, final int number, final List<Space> spaces, final String description) {

        this.hotelId = hotelId;
        this.number = number;
        this.spaces = spaces;
        this.description = description;
    }
}
