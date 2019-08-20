package com.kodilla.good.patterns.Food2Door;

public class ProductsOrderRepository implements OrderRepository {
    @Override
    public void createOrder(String name, String nameOfProduct, Integer numberOfProduct) {

        System.out.println("I enter the order in the register, reserve the product and update the inventory.");

    }
}
