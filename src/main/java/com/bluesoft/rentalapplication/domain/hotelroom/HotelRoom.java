package com.bluesoft.rentalapplication.domain.hotelroom;

import com.bluesoft.rentalapplication.domain.apartment.Booking;
import com.bluesoft.rentalapplication.domain.eventchannel.EventChannel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
public class HotelRoom {

    @Id
    @GeneratedValue
    private String hotelRoomId;

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

    public Booking book(final String tenantId, final List<LocalDate> days, final EventChannel eventChannel) {
       HotelRoomBooked hotelRoomBooked = HotelRoomBooked.create(hotelRoomId,hotelId, tenantId, days);
       eventChannel.publish(hotelRoomBooked);
        return Booking.hotelRoom(hotelRoomId,tenantId,days);
    }
}
