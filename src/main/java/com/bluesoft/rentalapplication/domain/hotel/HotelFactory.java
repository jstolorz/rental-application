package com.bluesoft.rentalapplication.domain.hotel;

public class HotelFactory {
    public Hotel create(final String name, final String street, final String postalCode, final String buildingNumber, final String city, final String country) {

        Address address = new Address(street, postalCode, buildingNumber, city, country);
        return new Hotel(name, address);

    }
}
