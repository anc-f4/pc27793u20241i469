package com.medisupply.platform.u20241i469.procurement.application.commands;

import com.medisupply.platform.u20241i469.procurement.domain.model.vaueobjects.*;

public record CreateSupplyRequestCommand (
        Long id,
        RequestCode requestCode,
        FacilityId facilityId,
        FulfillmentPeriod fulfillmentPeriod,
        SupplyBatch supplyBatch,
        Integer urgencyLevel,
        SupplyRequestStatus status,
        String requestNotes
){
    public CreateSupplyRequestCommand{
        if(id == null || id <= 0){
            throw new IllegalArgumentException("ID must be a positive number");
        }
        if(urgencyLevel == null || urgencyLevel < 1 || urgencyLevel > 5){
            throw new IllegalArgumentException("Urgency level must be between 1 and 5");
        }
        if(requestNotes == null || requestNotes.trim().isEmpty()){
            throw new IllegalArgumentException("Request notes cannot be null or empty");
        }

    }
}