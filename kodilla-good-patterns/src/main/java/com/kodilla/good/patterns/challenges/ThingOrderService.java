package com.kodilla.good.patterns.challenges;

public class ThingOrderService implements OrderService {
    @Override
    public boolean order(User user, String thing, Double price) {
        if (user.getName() == "Jan" && thing == "Szafa" && price == 345.5) {
            return true;
        } else {
            return false;
        }
    }
}

