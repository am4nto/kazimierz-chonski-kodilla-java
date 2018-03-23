package com.kodilla.rps;

import java.util.ArrayList;

class Scisors extends Move {
    Scisors() {
        this.name = "scisors";
        this.losesAgainst = new ArrayList<>();
        losesAgainst.add("rock");
        this.winsAgainst = new ArrayList<>();
        winsAgainst.add("paper");
    }
}
