package com.medisupply.platform.u20241i469.procurement.domain.model.aggregates;


import com.medisupply.platform.u20241i469.procurement.domain.model.vaueobjects.FacilityId;
import com.medisupply.platform.u20241i469.procurement.domain.model.vaueobjects.SupplyBatch;
import com.medisupply.platform.u20241i469.procurement.domain.model.vaueobjects.FulfillmentPeriod;
import com.medisupply.platform.u20241i469.procurement.domain.model.vaueobjects.RequestCode;
import com.medisupply.platform.u20241i469.procurement.domain.model.vaueobjects.SupplyRequestStatus;

import java.time.Instant;


public class SupplyRequest {
    private Long id;
    private RequestCode requestCode;
    private FacilityId facilityId;
    private FulfillmentPeriod fulfillmentPeriod;
    private SupplyBatch supplyBatch;
    private Integer urgencyLevel;
    private SupplyRequestStatus status;
    private String requestNotes;

    public SupplyRequest(Long id, RequestCode requestCode, FacilityId facilityId, FulfillmentPeriod fulfillmentPeriod,
                         SupplyBatch supplyBatch, Integer urgencyLevel, SupplyRequestStatus status, String requestNotes) {
        this.id = id;
        this.requestCode = requestCode;
        this.facilityId = facilityId;
        this.fulfillmentPeriod = fulfillmentPeriod;
        this.supplyBatch = supplyBatch;
        this.urgencyLevel = urgencyLevel;
        this.status = status;
        this.requestNotes = requestNotes;
    }
 public Long getId() {
        return id;
    }

    public RequestCode getRequestCode() {
        return requestCode;
    }

    public FacilityId getFacilityId() {
        return facilityId;
    }

    public FulfillmentPeriod getFulfillmentPeriod() {
        return fulfillmentPeriod;
    }

    public SupplyBatch getSupplyBatch() {
        return supplyBatch;
    }

    public Integer getUrgencyLevel() {
        return urgencyLevel;
    }

    public SupplyRequestStatus getStatus() {
        return status;
    }

    public String getRequestNotes() {
        return requestNotes;
    }
}