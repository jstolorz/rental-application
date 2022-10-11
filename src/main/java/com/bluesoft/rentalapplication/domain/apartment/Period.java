package com.bluesoft.rentalapplication.domain.apartment;

import javax.persistence.Embeddable;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


public class Period {
    private final LocalDate start;
    private final LocalDate end;

    public Period(final LocalDate start, final LocalDate end) {

        this.start = start;
        this.end = end;
    }

    List<LocalDate> asDays(final Period period) {
        return start.datesUntil(end).collect(Collectors.toList());
    }

    LocalDate getStart() {
        return start;
    }

    LocalDate getEnd() {
        return end;
    }
}
