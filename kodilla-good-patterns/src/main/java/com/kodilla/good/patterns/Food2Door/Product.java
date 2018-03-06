package com.kodilla.good.patterns.Food2Door;

import java.util.Objects;

public final class Product {
    private final String productName;
    private final double quantity;
    private final double price;

    public Product(final String productName, final int quantity, final double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getQuantity() {

        return quantity;
    }

    public double getPrice() {

        return price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productName, product.productName);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
