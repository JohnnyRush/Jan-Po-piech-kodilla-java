package com.kodilla.good.patterns.Food2Door;

public class DeliveryProcessor {

    private InformationService informationService;
    private OrderRepository orderRepository;
    private Supplier supplier;

    DeliveryProcessor(final InformationService informationService,
                      final OrderRepository orderRepository,
                      final Supplier supplier) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.supplier = supplier;
    }

    public DeliveryDto order() {
        boolean isOrdered = supplier.process();

        if (isOrdered) {
            orderRepository.createOrder(supplier.getName(), supplier.getNameOfProduckt(), supplier.getNumberOfProduct());
            informationService.inform(supplier.getPhoneNumber());
            return new DeliveryDto(supplier.getName(), true, supplier);
        } else {
            return new DeliveryDto(supplier.getName(), false, supplier);
        }
    }


}
