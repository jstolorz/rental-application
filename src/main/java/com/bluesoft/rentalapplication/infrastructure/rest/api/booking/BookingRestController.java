package com.bluesoft.rentalapplication.infrastructure.rest.api.booking;


import com.bluesoft.rentalapplication.application.booking.BookingReject;
import com.bluesoft.rentalapplication.application.commandregistry.CommandRegister;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class BookingRestController {

    private final CommandRegister commandRegister;

    public BookingRestController(final CommandRegister commandRegister) {
        this.commandRegister = commandRegister;
    }

    @PutMapping("/reject/{id}")
    public void reject(@PathVariable String id){
        commandRegister.register(new BookingReject(id));
    }

}
