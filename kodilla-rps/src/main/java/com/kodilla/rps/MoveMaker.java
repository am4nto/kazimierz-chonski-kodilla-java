package com.kodilla.rps;

import java.util.Random;

public class MoveMaker {

    public Move yourMove(String input, int range) throws BadInputException {
        Move move;
        input = input.toUpperCase();
        switch (input) {
            case "R": {
                System.out.println("Twoj ruch: Kamien");
                move = new Rock();
                return move;
            }
            case "P": {
                System.out.println("Twoj ruch: Papier");
                move = new Paper();
                return move;
            }
            case "S": {
                System.out.println("Twoj ruch: Nozyce");
                move = new Scisors();
                return move;
            }
            case "W": {
                if (range > 3) {
                    System.out.println("Twoj ruch: Studnia");
                    move = new Well();
                    return move;
                } else throw new BadInputException("Wprowadz poprawna wartosc");
            }
            case "B": {
                if (range > 4) {
                    System.out.println("Twoj ruch: Bomba");
                    move = new Bomb();
                    return move;
                } else throw new BadInputException("Wprowadz poprawna wartosc");
            }
            default:
                throw new BadInputException("Wprowadz poprawna wartosc");
        }
    }
    public Move myMove(int input) throws BadInputException {
        Move move;
        switch (input) {
            case 0: {
                System.out.println("Moj ruch: Kamien");
                move = new Rock();
                break;
            }
            case 1: {
                System.out.println("Moj ruch: Papier");
                move = new Paper();
                break;
            }
            case 2: {
                System.out.println("Moj ruch: Nozyce");
                move = new Scisors();
                break;
            }
            case 3: {
                System.out.println("Moj ruch: Studnia");
                move = new Well();
                break;
            }
            case 4: {
                System.out.println("Moj ruch: Bomba");
                move = new Bomb();
                break;
            }
            default:
                throw new BadInputException("Nieprawidlowa wartosc: " + input);
        }
        return move;
    }
}
