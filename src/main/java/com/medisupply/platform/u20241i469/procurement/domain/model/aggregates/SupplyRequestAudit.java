package com.medisupply.platform.u20241i469.procurement.domain.model.aggregates;

import java.time.Instant;

public class SupplyRequestAudit {
    private final Instant createdAt;
    private Instant updatedAt;

    public SupplyRequestAudit() {
        this.createdAt = Instant.now();
        this.updatedAt = this.createdAt;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void updateTimestamp() {
        this.updatedAt = Instant.now();
    }
}