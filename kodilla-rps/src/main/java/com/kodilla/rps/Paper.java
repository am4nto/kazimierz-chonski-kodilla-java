package com.kodilla.rps;

import java.util.ArrayList;

class Paper extends Move {
    Paper() {
        this.name = "paper";
        this.losesAgainst = new ArrayList<>();
        losesAgainst.add("scisors");
        losesAgainst.add("bomb");
        this.winsAgainst = new ArrayList<>();
        winsAgainst.add("rock");
        winsAgainst.add("well");
    }
}
