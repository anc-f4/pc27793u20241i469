package com.medisupply.platform.u20241i469.procurement.domain.model.vaueobjects;

import java.time.LocalDate;

public record FulfillmentPeriod(LocalDate startDate, LocalDate endDate) {
    public FulfillmentPeriod {
        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException("Start date and end date cannot be null");
        }
        if (endDate.isBefore(startDate)) {
            throw new IllegalArgumentException("End date cannot be before start date");
        }
    }
    public boolean contains(LocalDate checkDate) {
        if (checkDate == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        return !checkDate.isBefore(startDate) && !checkDate.isAfter(endDate);
    }
}
