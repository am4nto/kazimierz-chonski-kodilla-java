package com.kodilla.good.patterns.Food2Door;

public class SupplyService {
    public static void order (Supplier supplier){
        //supplier.process();
        if (supplier.process()) {
            System.out.println("Zamowienie zrealizowane pomyslnie");
        }
    }
}
