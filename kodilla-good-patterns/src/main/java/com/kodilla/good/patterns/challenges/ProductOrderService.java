package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ProductOrderService {
    private Order order;
    private ShippingService shippingService;

    public ProductOrderService(final Order order, final ShippingService shippingService) {
        this.order = order;
        this.shippingService = shippingService;
    }

    public void odrerProcess (Order order, ShippingService shippingService, User user) {
        boolean isAccepted = order.orderAccepted(LocalDate.now(), user);
        if (isAccepted) {
            boolean isShipped  = shippingService.shipTo(user);
        }
    }
}
