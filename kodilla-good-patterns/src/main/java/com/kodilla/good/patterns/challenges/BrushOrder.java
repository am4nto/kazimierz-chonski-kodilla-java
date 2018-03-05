package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class BrushOrder implements Order {
    @Override
    public boolean orderAccepted(LocalDate orderDate, User user) {
        System.out.println("Szczotka do zebow zamowiona przez uzytkownika " + user.getUserName() + " w dniu " + orderDate);
        return true;
    }
}
