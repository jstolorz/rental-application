package com.bluesoft.rentalapplication.query.apartment;

import javax.persistence.*;
import java.util.List;

@Entity
public class ApartmentReadModel {

    @Id
    @GeneratedValue
    private String id;
    private  String ownerId;
    private final String street;
    private final String postalCode;
    private final String houseNumber;
    private final String apartmentNumber;
    private final String city;
    private final String country;

    @OneToMany
    private List<RoomReadModel> rooms;
    private final String description;

    public ApartmentReadModel(String id,
            final String ownerId, final String street, final String postalCode,
                              final String houseNumber, final String apartmentNumber, final String city,
                              final String country, final List<RoomReadModel> rooms, final String description) {
        this.id = id;
        this.ownerId = ownerId;
        this.street = street;
        this.postalCode = postalCode;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
        this.country = country;
        this.rooms = rooms;
        this.description = description;
    }

    String getId() {
        return id;
    }

    String getOwnerId() {
        return ownerId;
    }

    String getStreet() {
        return street;
    }

    String getPostalCode() {
        return postalCode;
    }

    String getHouseNumber() {
        return houseNumber;
    }

    String getApartmentNumber() {
        return apartmentNumber;
    }

    String getCity() {
        return city;
    }

    String getCountry() {
        return country;
    }

    List<RoomReadModel> getRooms() {
        return rooms;
    }

    String getDescription() {
        return description;
    }
}
