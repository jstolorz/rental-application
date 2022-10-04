package com.bluesoft.rentalapplication.infrastructure.persistence.jpa.hotelbookinghistory;

import com.bluesoft.rentalapplication.domain.hotelbookinghistory.HotelBookingHistory;
import com.bluesoft.rentalapplication.domain.hotelbookinghistory.HotelBookingHistoryRepository;

class JpaHotelBookingHistoryRepository implements HotelBookingHistoryRepository {

    private final SpringJpaHotelBookingHistoryRepository hotelBookingHistoryRepository;

    JpaHotelBookingHistoryRepository(final SpringJpaHotelBookingHistoryRepository hotelBookingHistoryRepository) {
        this.hotelBookingHistoryRepository = hotelBookingHistoryRepository;
    }

    @Override
    public void save(final HotelBookingHistory hotelBookingHistory) {
        hotelBookingHistoryRepository.save(hotelBookingHistory);
    }

    @Override
    public boolean existsFor(final String hotelId) {
        return hotelBookingHistoryRepository.existsById(hotelId);
    }

    @Override
    public HotelBookingHistory findFor(final String hotelId) {
        return hotelBookingHistoryRepository.findById(hotelId).get();
    }
}
