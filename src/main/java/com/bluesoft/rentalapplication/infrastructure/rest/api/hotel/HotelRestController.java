package com.bluesoft.rentalapplication.infrastructure.rest.api.hotel;

import com.bluesoft.rentalapplication.application.hotel.HotelApplicationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotel")
public class HotelRestController {

    private final HotelApplicationService hotelApplicationService;

    public HotelRestController(final HotelApplicationService hotelApplicationService) {
        this.hotelApplicationService = hotelApplicationService;
    }

    @PostMapping
    public void add(@RequestBody HotelDto hotelDto){
       hotelApplicationService.add(
               hotelDto.getName(),
               hotelDto.getStreet(),
               hotelDto.getPostalCode(),
               hotelDto.getBuildingNumber(),
               hotelDto.getCity(),
               hotelDto.getCountry()
       );
    }


}
