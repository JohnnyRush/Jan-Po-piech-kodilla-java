package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriver {

    public OrderRequest retriver() {
        User user = new User("Jan", "Kowalski");
        String thing = "Szafa";
        Double price = 345.5;

        return new OrderRequest(user, thing, price);
    }
}
