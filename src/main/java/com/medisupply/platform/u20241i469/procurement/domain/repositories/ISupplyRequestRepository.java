package com.medisupply.platform.u20241i469.procurement.domain.repositories;

import com.medisupply.platform.u20241i469.procurement.domain.model.aggregates.SupplyRequest;

import java.util.Optional;

public interface ISupplyRequestRepository {
    Optional<SupplyRequest> findById(Long id);
}
