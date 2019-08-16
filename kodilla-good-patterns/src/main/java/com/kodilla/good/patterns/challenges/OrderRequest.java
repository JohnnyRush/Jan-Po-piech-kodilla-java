package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    private User user;
    private String thing;
    private Double price;

    public OrderRequest(User user, String thing, Double price) {
        this.user = user;
        this.thing = thing;
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public String getThing() {
        return thing;
    }

    public Double getPrice() {
        return price;
    }
}
