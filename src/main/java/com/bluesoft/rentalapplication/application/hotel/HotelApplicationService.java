package com.bluesoft.rentalapplication.application.hotel;

import com.bluesoft.rentalapplication.domain.hotel.Address;
import com.bluesoft.rentalapplication.domain.hotel.Hotel;

public class HotelApplicationService {

    public void add(String name,
                    String street,
                    String postalCode,
                    String buildingNumber,
                    String city,
                    String country){

        Address address = new Address(street, postalCode, buildingNumber, city, country);

        new Hotel(name, address);

    }

}
