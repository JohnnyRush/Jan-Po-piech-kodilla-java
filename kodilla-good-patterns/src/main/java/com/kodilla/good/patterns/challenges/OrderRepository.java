package com.kodilla.good.patterns.challenges;

public interface OrderRepository {
    public void createOrder(User user, String thing, Double price);
}
