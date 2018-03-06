package com.kodilla.good.patterns.Food2Door;

import java.util.List;

public class GlutenFreeShop implements Supplier {
    private List<Product> products;

    public GlutenFreeShop(List<Product> products) {
        this.products = products;
    }

    private double toPay() {
        double totalPrice = 0;
        for (Product product : products) {
            double value = 0;
            value = product.getPrice() * product.getQuantity();
            totalPrice = totalPrice + value;
        }
        totalPrice = totalPrice * 100;
        totalPrice = Math.round(totalPrice);
        totalPrice = totalPrice / 100;
        return totalPrice;
    }
    @Override
    public boolean process() {
        System.out.println("Zamowiono towar u dostawcy GlutenFreeShop na kwote " + toPay() + " PLN");
        return true;
    }
}
