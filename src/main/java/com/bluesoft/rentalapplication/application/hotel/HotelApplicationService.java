package com.bluesoft.rentalapplication.application.hotel;

import com.bluesoft.rentalapplication.domain.hotel.Hotel;
import com.bluesoft.rentalapplication.domain.hotel.HotelFactory;
import com.bluesoft.rentalapplication.domain.hotel.HotelRepository;

public class HotelApplicationService {

    private final HotelRepository hotelRepository;

    public HotelApplicationService(final HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public void add(String name,
                    String street,
                    String postalCode,
                    String buildingNumber,
                    String city,
                    String country){

        final Hotel hotel = new HotelFactory().create(name, street, postalCode, buildingNumber, city, country);

        hotelRepository.save(hotel);

    }

}
