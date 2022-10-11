package com.bluesoft.rentalapplication.domain.apartment;

import javax.persistence.Embeddable;
import java.time.LocalDate;

@Embeddable
public class Period {
    private final LocalDate start;
    private final LocalDate end;

    public Period(final LocalDate start, final LocalDate end) {

        this.start = start;
        this.end = end;
    }

    LocalDate getStart() {
        return start;
    }

    LocalDate getEnd() {
        return end;
    }
}
