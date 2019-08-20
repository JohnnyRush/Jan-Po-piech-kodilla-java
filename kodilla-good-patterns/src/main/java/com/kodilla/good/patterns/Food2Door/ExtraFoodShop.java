package com.kodilla.good.patterns.Food2Door;

public class ExtraFoodShop extends Supplier {

    public ExtraFoodShop(String name, String nameOfProduckt, Integer numberOfProduct, Integer phoneNumber) {
        super(name, nameOfProduckt, numberOfProduct, phoneNumber);
    }

    @Override
    public boolean process() {
        if (numberOfProduct > 200) {
            return true;
        } else {
            return false;
        }
    }
}
