package com.medisupply.platform.u20241i469.procurement.application.commandservices;

import com.medisupply.platform.u20241i469.procurement.domain.model.aggregates.SupplyRequest;

public interface CreateSupplyRequestCommandService {
    SupplyRequest handle(CreateSupplyRequestCommandService command);
}
