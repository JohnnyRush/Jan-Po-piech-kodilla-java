package com.kodilla.good.patterns.Food2Door;

public class ProductOrderService {
    public static void main(String[] args) {

        ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop", "carrot", 240, 5784785);
        HealthyShop healthyShop = new HealthyShop("HealthyShop", "milk", 400, 548769);
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop("GlutenFreeShop", "potato", 200, 123456789);

        DeliveryProcessor deliveryProcessor = new DeliveryProcessor(new SmsService(), new ProductsOrderRepository(), glutenFreeShop);
        DeliveryDto deliveryDto = deliveryProcessor.order();

        if (deliveryDto.isOrder() == true) {
            System.out.println("Order completed for: " + deliveryDto.getSupplier());
        } else {
            System.out.println("Order not completed for: " + deliveryDto.getSupplier());
        }
    }
}
