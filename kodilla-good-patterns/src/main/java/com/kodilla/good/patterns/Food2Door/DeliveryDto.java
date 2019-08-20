package com.kodilla.good.patterns.Food2Door;

public class DeliveryDto {
    private String supplierName;
    private boolean isOrder;
    private Supplier supplier;

    public DeliveryDto(String supplierName, boolean isOrder, Supplier supplier) {
        this.supplierName = supplierName;
        this.isOrder = isOrder;
        this.supplier = supplier;
    }

    public String getSupplier() {
        return supplier.getName();
    }

    public boolean isOrder() {
        return isOrder;
    }
}
