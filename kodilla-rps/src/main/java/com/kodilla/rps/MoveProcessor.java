package com.kodilla.rps;

public class MoveProcessor {

    public void process(Move yourMove, Move myMove) {
        if(yourMove.winsAgainst.contains(myMove.name)) {
            System.out.println("wygrales");
        } else if (yourMove.losesAgainst.contains(myMove.name)) {
            System.out.println("Przegrales");
        } else {
            System.out.println("Remis");
        }
    }

}
