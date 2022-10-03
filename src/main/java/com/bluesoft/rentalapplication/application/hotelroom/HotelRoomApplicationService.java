package com.bluesoft.rentalapplication.application.hotelroom;

import com.bluesoft.rentalapplication.domain.hotelroom.HotelRoom;
import com.bluesoft.rentalapplication.domain.hotelroom.HotelRoomFactory;
import com.bluesoft.rentalapplication.domain.hotelroom.HotelRoomRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class HotelRoomApplicationService {

    private final HotelRoomRepository hotelRoomRepository;

    public HotelRoomApplicationService(final HotelRoomRepository hotelRoomRepository) {
        this.hotelRoomRepository = hotelRoomRepository;
    }

    public void add(String hotelId,
                    int number,
                    Map<String, Double> spacesDefinition,
                    String description){

          HotelRoom hotelRoom = new HotelRoomFactory().create(hotelId, number, spacesDefinition,description);

          hotelRoomRepository.save(hotelRoom);
    }

    public void book(final String id, final String tenantId, final List<LocalDate> days) {

    }
}
