package com.kodilla.rps;

import java.util.ArrayList;

public class Well extends Move {
    public Well() {
        this.name = "well";
        this.losesAgainst = new ArrayList<>();
        losesAgainst.add("bomb");
        losesAgainst.add("paper");
        this.winsAgainst = new ArrayList<>();
        winsAgainst.add("rock");
        winsAgainst.add("scisors");
    }
}
