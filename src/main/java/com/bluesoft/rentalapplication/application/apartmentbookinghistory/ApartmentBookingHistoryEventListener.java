package com.bluesoft.rentalapplication.application.apartmentbookinghistory;

import com.bluesoft.rentalapplication.domain.apartment.ApartmentBooked;
import com.bluesoft.rentalapplication.domain.apartmentbookinghistory.ApartmentBooking;
import com.bluesoft.rentalapplication.domain.apartmentbookinghistory.ApartmentBookingHistory;
import com.bluesoft.rentalapplication.domain.apartmentbookinghistory.ApartmentBookingHistoryRepository;
import org.springframework.context.event.EventListener;

public class ApartmentBookingHistoryEventListener {

    private final ApartmentBookingHistoryRepository apartmentBookingHistoryRepository;

    public ApartmentBookingHistoryEventListener(final ApartmentBookingHistoryRepository apartmentBookingHistoryRepository) {
        this.apartmentBookingHistoryRepository = apartmentBookingHistoryRepository;
    }

    @EventListener
    public void consume(ApartmentBooked apartmentBooked){

        String apartmentId = apartmentBooked.getApartmentId();

        ApartmentBookingHistory apartmentBookingHistory = getApartmentBookingHistory(apartmentId);

       apartmentBookingHistory.add(ApartmentBooking.start(
               apartmentBooked.getOwnerId(),
               apartmentBooked.getTenantId(),
               apartmentBooked.getPeriodStart(),
               apartmentBooked.getPeriodEnd()
       ));

        apartmentBookingHistoryRepository.save(apartmentBookingHistory);
    }

    private ApartmentBookingHistory getApartmentBookingHistory(final String apartmentId) {

        if(apartmentBookingHistoryRepository.exists(apartmentId)){
            return apartmentBookingHistoryRepository.findFor(apartmentId);
        }else {
            return new ApartmentBookingHistory(apartmentId);
        }

    }

}
