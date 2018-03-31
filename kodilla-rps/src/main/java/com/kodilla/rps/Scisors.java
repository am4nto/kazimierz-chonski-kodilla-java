package com.kodilla.rps;

import java.util.ArrayList;

class Scisors extends Move {
    Scisors() {
        this.name = "scisors";
        this.losesAgainst = new ArrayList<>();
        losesAgainst.add("rock");
        losesAgainst.add("well");
        this.winsAgainst = new ArrayList<>();
        winsAgainst.add("paper");
        winsAgainst.add("bomb");
    }
}
