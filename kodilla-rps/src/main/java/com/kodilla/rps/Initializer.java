package com.kodilla.rps;

import java.util.Scanner;

public class Initializer {
    private int gameLength;
    private int movesRange;
    private Scanner scanner = new Scanner(System.in);
    private Scanner scanner2 = new Scanner(System.in);
    private boolean goNext = false;
    private boolean end = false;

    public int getGameLength() {
        return gameLength;
    }

    public int getMovesRange() {
        return movesRange;
    }

    public boolean isEnd() {
        return end;
    }

    void initialize() {
        System.out.println("Witaj, \n Podaj, do ilu wygranych chcesz grac");
        try {
            gameLength = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Nieprawidlowa wartosc");
        }

        if (gameLength == 0) {
            end = true;
            System.out.println("Koniec gry.");
        }else {
            while (!goNext) {
                System.out.println("Wybierz zestwa ruchow: S - standardowy, E - rozszerzony, Q - wyjscie");
                String response = scanner2.nextLine();
                response = response.toUpperCase();
                switch (response) {
                    case "S": {
                        System.out.println("Wybrano standardowy zestaw ruchow");
                        movesRange = 3;
                        goNext = true;
                        break;
                    }
                    case "E": {
                        System.out.println("Wybrano rozszerzony zestaw ruchow\n " +
                                "Dodano nowe figury: Studnia, Bomba (ceramiczne naczynie wypelnione czarnym prochem, wyposazone w lont)\n" +
                                "Kamien i nozyce wpadaja do studni\n" +
                                "Bomba wysadza studnie\n" +
                                "Papier przykrywa studnie\n" +
                                "Bomba rozrywa papier\n" +
                                "Nozyce odcinaja lont od bomby\n" +
                                "Kamien rozbija bombe");
                        movesRange = 5;
                        goNext = true;
                        break;
                    }
                    case "Q": {
                        System.out.println("Wybrano wyjscie. Koniec gry.");
                        goNext = true;
                        end = true;
                        break;
                    }

                    default:
                        System.out.println("Nieprawidlowa wartosc");
                }
            }
        }
    }
}
