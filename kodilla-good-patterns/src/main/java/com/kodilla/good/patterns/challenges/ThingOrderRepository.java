package com.kodilla.good.patterns.challenges;

public class ThingOrderRepository implements OrderRepository {
    @Override
    public void createOrder(User user, String thing, Double price) {

        System.out.println("Wpisuję zamówienie w rejestr, rezerwuję produkt i aktualizuję stan magazynowy");

    }
}
