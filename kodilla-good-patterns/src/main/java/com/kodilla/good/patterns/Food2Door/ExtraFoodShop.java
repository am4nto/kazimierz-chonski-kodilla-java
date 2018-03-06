package com.kodilla.good.patterns.Food2Door;

import java.util.List;

public class ExtraFoodShop implements Supplier {
    private List<Product> products;

    public ExtraFoodShop(List<Product> products) {
        this.products = products;
    }


    private double toPay() {
        double totalPrice = 0;
        for (Product product : products) {
            double value = product.getPrice() * product.getQuantity();
            totalPrice = totalPrice + value;
        }
        if (totalPrice > 1000) {totalPrice = totalPrice * 0.9;}
        totalPrice = totalPrice * 100;
        totalPrice = Math.round(totalPrice);
        totalPrice = totalPrice / 100;
        return totalPrice;
    }

    @Override
    public boolean process() {
        System.out.println("Zamowiono towar u dostawcy ExtraFoodShop na kwote " + toPay() + " PLN");
        return true;
    }
}
