package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

public abstract class Move {
    String name;
    List<String>winsAgainst = new ArrayList<>();
    List<String>losesAgainst = new ArrayList<>();
}
