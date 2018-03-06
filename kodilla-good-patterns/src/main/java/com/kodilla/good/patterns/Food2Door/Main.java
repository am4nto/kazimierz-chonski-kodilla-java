package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        List<Product>productsList1 = new ArrayList<>();
        productsList1.add(new Product("ser", 100, 5));
        productsList1.add(new Product("jogurt", 30, 2.50));
        productsList1.add(new Product("baton", 150, 1.50));
        productsList1.add(new Product("maslo", 101, 2));

        List<Product>productList2 = new ArrayList<>();
        productList2.add(new Product("jablko", 100, 1));
        productList2.add(new Product("banan", 80, 1.5));
        productList2.add(new Product("arbuz", 11, 15));

        List<Product>productList3 = new ArrayList<>();
        productList3.add(new Product("chleb", 80, 5));
        productList3.add(new Product("kajzerka", 210, 0.6));
        productList3.add(new Product("ciastko", 50, 3.4));
        productList3.add(new Product("extratort", 1, 100));

        Supplier shop1 = new ExtraFoodShop(productsList1);
        Supplier shop2 = new HealthyShop(productList2);
        Supplier shop3 = new GlutenFreeShop(productList3);

        SupplyService.order(shop1);
        SupplyService.order(shop2);
        SupplyService.order(shop3);



    }
}
