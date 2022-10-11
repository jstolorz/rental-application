package com.bluesoft.rentalapplication.infrastructure.persistence.jpa.booking;

import com.bluesoft.rentalapplication.domain.apartment.Booking;
import org.springframework.data.repository.CrudRepository;

interface SpringJpaBookingRepository extends CrudRepository<Booking,String> {
}
