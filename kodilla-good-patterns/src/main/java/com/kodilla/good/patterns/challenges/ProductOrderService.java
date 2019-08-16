package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    public static void main(String[] args) {

        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retriver();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new ThingOrderService(), new ThingOrderRepository());
        OrderDto orderDto = orderProcessor.process(orderRequest);
        if (orderDto.isOrder() == true) {
            System.out.println("Pan Jan kupił szafę za 345.5 zł");
        } else {
            System.out.println("Zamówienie nie możliwe do zrealizowania");
        }

    }

}
