package com.bluesoft.rentalapplication.infrastructure.rest.api.apartment;

import com.bluesoft.rentalapplication.application.apartment.ApartmentApplicationService;
import com.bluesoft.rentalapplication.query.apartment.ApartmentReadModel;
import com.bluesoft.rentalapplication.query.apartment.QueryApartmentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/apartment")
public class ApartmentRestController {
    private final ApartmentApplicationService apartmentApplicationService;
    private final QueryApartmentRepository queryApartmentRepository;

    public ApartmentRestController(final ApartmentApplicationService apartmentApplicationService, final QueryApartmentRepository queryApartmentRepository) {
        this.apartmentApplicationService = apartmentApplicationService;
        this.queryApartmentRepository = queryApartmentRepository;
    }

    @PostMapping
    public void add(@RequestBody ApartmentDto apartmentDto) {
        apartmentApplicationService.add(
                apartmentDto.getOwnerId(),
                apartmentDto.getStreet(),
                apartmentDto.getPostalCode(),
                apartmentDto.getHouseNumber(),
                apartmentDto.getApartmentNumber(),
                apartmentDto.getCity(),
                apartmentDto.getCountry(),
                apartmentDto.getDescription(),
                apartmentDto.getRoomsDefinition()
        );
    }

    @PutMapping("/book/{id}")
    public void book(@PathVariable String id, @RequestBody ApartmentBookingDto apartmentBookingDto) {
        apartmentApplicationService.book(
                id,
                apartmentBookingDto.getTenantId(),
                apartmentBookingDto.getStart(),
                apartmentBookingDto.getEnd()
        );
    }

    @GetMapping
    public List<ApartmentReadModel> findAll(){
        return queryApartmentRepository.findAll();
    }

}
