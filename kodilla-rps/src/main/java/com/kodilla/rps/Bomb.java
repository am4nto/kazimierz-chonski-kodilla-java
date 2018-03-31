package com.kodilla.rps;

import java.util.ArrayList;

public class Bomb extends Move {
    public Bomb() {
        this.name = "bomb";
        this.losesAgainst = new ArrayList<>();
        losesAgainst.add("rock");
        losesAgainst.add("scisors");
        this.winsAgainst = new ArrayList<>();
        winsAgainst.add("well");
        winsAgainst.add("paper");
    }
}
