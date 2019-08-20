package com.kodilla.good.patterns.Food2Door;

public class GlutenFreeShop extends Supplier {
    public GlutenFreeShop(String name, String nameOfProduckt, Integer numberOfProduct, Integer phoneNumber) {
        super(name, nameOfProduckt, numberOfProduct, phoneNumber);
    }

    @Override
    public boolean process() {
        if (phoneNumber == 123456789) {
            return true;
        } else {
            return false;
        }
    }
}
