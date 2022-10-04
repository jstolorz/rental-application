package com.bluesoft.rentalapplication.domain.hotelbookinghistory;

public interface HotelBookingHistoryRepository {
    void save(HotelBookingHistory hotelBookingHistory);

    boolean existsFor(String hotelId);

    HotelBookingHistory findFor(String hotelId);
}
