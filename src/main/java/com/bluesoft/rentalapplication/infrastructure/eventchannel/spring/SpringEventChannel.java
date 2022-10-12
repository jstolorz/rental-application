package com.bluesoft.rentalapplication.infrastructure.eventchannel.spring;

import com.bluesoft.rentalapplication.domain.apartment.ApartmentBooked;
import com.bluesoft.rentalapplication.domain.apartment.BookingAccepted;
import com.bluesoft.rentalapplication.domain.eventchannel.EventChannel;
import com.bluesoft.rentalapplication.domain.hotelroom.HotelRoomBooked;
import org.springframework.context.ApplicationEventPublisher;

class SpringEventChannel implements EventChannel {

    private final ApplicationEventPublisher applicationEventPublisher;

    SpringEventChannel(final ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Override
    public void publish(final ApartmentBooked apartmentBooked) {
       applicationEventPublisher.publishEvent(apartmentBooked);
    }

    @Override
    public void publish(final HotelRoomBooked hotelRoomBooked) {
      applicationEventPublisher.publishEvent(hotelRoomBooked);
    }

    @Override
    public void publish(final BookingAccepted bookingAccepted) {
        applicationEventPublisher.publishEvent(bookingAccepted);
    }
}
