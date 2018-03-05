package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class PhoneOrder implements Order {
    @Override
    public boolean orderAccepted(LocalDate orderDate, User user) {
        System.out.println("Telefon zamowiony przez uzytkownika " + user.getUserName() + "w dniu " + orderDate);
        return true;
    }
}
