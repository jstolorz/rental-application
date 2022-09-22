package com.bluesoft.rentalapplication.application.hotelroom;

import com.bluesoft.rentalapplication.domain.hotelroom.HotelRoom;
import com.bluesoft.rentalapplication.domain.hotelroom.HotelRoomFactory;

import java.util.Map;

public class HotelRoomApplicationService {
    public void add(String hotelId,
                    int number,
                    Map<String, Double> spacesDefinition,
                    String description){

          HotelRoom hotelRoom = new HotelRoomFactory().create(hotelId, number, spacesDefinition,description);
    }
}
