package com.kodilla.good.patterns.Food2Door;

public class Supplier {
    public String name;
    public String nameOfProduckt;
    public Integer numberOfProduct;
    public Integer phoneNumber;

    public Supplier(String name, String nameOfProduckt, Integer numberOfProduct, Integer phoneNumber) {
        this.name = name;
        this.nameOfProduckt = nameOfProduckt;
        this.numberOfProduct = numberOfProduct;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getNameOfProduckt() {
        return nameOfProduckt;
    }

    public Integer getNumberOfProduct() {
        return numberOfProduct;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public boolean process(){
        return false;
    }
}
