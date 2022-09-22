package com.bluesoft.rentalapplication.domain.hotel;

class Address {
    private final String street;
    private final String postalCode;
    private final String buildingNumber;
    private final String city;
    private final String country;

    Address(final String street, final String postalCode, final String buildingNumber, final String city, final String country) {

        this.street = street;
        this.postalCode = postalCode;
        this.buildingNumber = buildingNumber;
        this.city = city;
        this.country = country;
    }
}
