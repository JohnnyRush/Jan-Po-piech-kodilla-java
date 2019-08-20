package com.kodilla.good.patterns.Food2Door;

public class HealthyShop extends Supplier{

    public HealthyShop(String name, String nameOfProduckt, Integer numberOfProduct, Integer phoneNumber) {
        super(name, nameOfProduckt, numberOfProduct, phoneNumber);
    }

    @Override
    public boolean process() {
        if (name.length() > 3)  {
            return true;
        } else {
            return false;
        }
    }
}
