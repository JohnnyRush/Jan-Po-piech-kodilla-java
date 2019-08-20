package com.kodilla.good.patterns.Food2Door;

public interface OrderRepository {
    public void createOrder(String name, String nameOfProduct, Integer numberOfProduct);
}
