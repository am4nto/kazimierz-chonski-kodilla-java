package com.kodilla.rps;

public class MoveProcessor {
    private int winCount;
    private int loseCount;

    public MoveProcessor() {
        this.winCount = 0;
        this.loseCount = 0;
    }

    public int getWinCount() {
        return winCount;
    }

    public int getLoseCount() {
        return loseCount;
    }

    public void process(Move yourMove, Move myMove) {
        if(yourMove.winsAgainst.contains(myMove.name)) {
            System.out.println("wygrales");
            winCount ++;
        } else if (yourMove.losesAgainst.contains(myMove.name)) {
            System.out.println("Przegrales");
            loseCount ++;
        } else {
            System.out.println("Remis");
        }
    }

}
