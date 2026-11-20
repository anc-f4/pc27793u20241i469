package com.medisupply.platform.u20241i469.procurement.domain.model.vaueobjects;

public record SupplyBatch(Integer quantity, String unit) {

    public SupplyBatch{
        if (quantity == null || quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be a positive integer");
        }
        if (unit == null || unit.isBlank()) {
            throw new IllegalArgumentException("Unit cannot be null or blank");
        }
    }
 public SupplyBatch addUnits(Integer additionalQuantity) {
        if (additionalQuantity == null || additionalQuantity <= 0) {
            throw new IllegalArgumentException("Additional quantity must be a positive integer");
        }
        long totalQuantity= (long) this.quantity + additionalQuantity;
        if (totalQuantity > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Total quantity exceeds maximum integer value");
        }
        return new SupplyBatch((int) totalQuantity, this.unit);
    }
}
