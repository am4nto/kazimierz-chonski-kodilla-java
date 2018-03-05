package com.kodilla.good.patterns.challenges;

public class ProductShipping implements ShippingService {
    @Override
    public boolean shipTo(User user) {
        System.out.println("Zamowienie uzytkownika " + user.getUserName() + " Zostalo wyslane");
        return true;
    }
}
