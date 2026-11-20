package com.medisupply.platform.u20241i469.procurement.domain.model.vaueobjects;

import java.util.UUID;

public record FacilityId(UUID value) {
    public FacilityId {
        if (value == null) {
            throw new IllegalArgumentException("Facility ID cannot be null");
        }
    }
}
