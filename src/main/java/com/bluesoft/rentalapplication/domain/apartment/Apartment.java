package com.bluesoft.rentalapplication.domain.apartment;

import com.bluesoft.rentalapplication.domain.eventchannel.EventChannel;

import javax.persistence.*;
import java.util.List;

@Entity
public class Apartment {

    @Id
    @GeneratedValue
    private String id;
    private final String ownerId;

    @Embedded
    private final Address address;

    @OneToMany
    private List<Room> rooms;
    private final String description;

    Apartment(final String ownerId, final Address address, final List<Room> rooms, final String description) {

        this.ownerId = ownerId;
        this.address = address;
        this.rooms = rooms;
        this.description = description;
    }

    public Booking book(final String tenantId, final Period period, final EventChannel eventChannel) {
        final ApartmentBooked apartmentBooked = ApartmentBooked.create(id, ownerId, tenantId, period);
        eventChannel.publish(apartmentBooked);

        return Booking.apartment(id,tenantId,period);
    }
}
