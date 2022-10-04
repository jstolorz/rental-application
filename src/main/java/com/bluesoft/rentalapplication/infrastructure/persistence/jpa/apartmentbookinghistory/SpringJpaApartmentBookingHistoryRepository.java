package com.bluesoft.rentalapplication.infrastructure.persistence.jpa.apartmentbookinghistory;

import com.bluesoft.rentalapplication.domain.apartmentbookinghistory.ApartmentBookingHistory;
import org.springframework.data.repository.CrudRepository;

public interface SpringJpaApartmentBookingHistoryRepository extends CrudRepository<ApartmentBookingHistory, String> {
}
