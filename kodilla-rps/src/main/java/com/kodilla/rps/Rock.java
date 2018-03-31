package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

class Rock extends Move {
    Rock() {
        this.name = "rock";
        this.losesAgainst = new ArrayList<>();
        losesAgainst.add("paper");
        losesAgainst.add("well");
        this.winsAgainst = new ArrayList<>();
        winsAgainst.add("scisors");
        winsAgainst.add("bomb");

    }
}
