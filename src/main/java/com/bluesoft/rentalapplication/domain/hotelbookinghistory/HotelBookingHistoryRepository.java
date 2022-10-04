package com.bluesoft.rentalapplication.domain.hotelbookinghistory;

public interface HotelBookingHistoryRepository {
    void save(HotelBookingHistory hotelBookingHistory);

    boolean existdFor(String hotelId);

    HotelBookingHistory findFor(String hotelId);
}
