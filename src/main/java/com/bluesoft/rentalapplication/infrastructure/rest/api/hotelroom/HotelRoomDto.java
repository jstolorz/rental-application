package com.bluesoft.rentalapplication.infrastructure.rest.api.hotelroom;

import java.util.Map;

class HotelRoomDto {

   private final String hotelId;
   private final int number;
   private final Map<String, Double> spacesDefinition;
   private final String descriptio;

    HotelRoomDto(final String hotelId, final int number, final Map<String, Double> spacesDefinition, final String descriptio) {
        this.hotelId = hotelId;
        this.number = number;
        this.spacesDefinition = spacesDefinition;
        this.descriptio = descriptio;
    }

    String getHotelId() {
        return hotelId;
    }

    int getNumber() {
        return number;
    }

    Map<String, Double> getSpacesDefinition() {
        return spacesDefinition;
    }

    String getDescriptio() {
        return descriptio;
    }
}
