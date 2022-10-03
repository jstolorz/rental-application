package com.bluesoft.rentalapplication.infrastructure.rest.api.apartment;

import java.time.LocalDate;

class ApartmentBookingDto {
    private final String tenantId;
    private final LocalDate start;
    private final LocalDate end;


    ApartmentBookingDto(final String tenantId, final LocalDate start, final LocalDate end) {
        this.tenantId = tenantId;
        this.start = start;
        this.end = end;
    }

    String getTenantId() {
        return tenantId;
    }

    LocalDate getStart() {
        return start;
    }

    LocalDate getEnd() {
        return end;
    }
}
