package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderMain {
    public static void main (String args[]){
        BrushOrder brushOrder = new BrushOrder();
        ProductShipping shipping = new ProductShipping();
        ProductOrderService orderService  = new ProductOrderService(brushOrder, shipping);
        User user = new User("Marian123", "Marian Nowak");

        orderService.odrerProcess(brushOrder, shipping, user);

    }
}
