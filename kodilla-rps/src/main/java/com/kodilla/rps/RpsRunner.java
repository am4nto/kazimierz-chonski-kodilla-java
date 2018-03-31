package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    public static void main(String[]args){

        MoveMaker maker = new MoveMaker();
        MoveProcessor processor = new MoveProcessor();
        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();
        Initializer initializer = new Initializer();

        initializer.initialize();
        boolean end = initializer.isEnd();

        while (!end){
            System.out.println("Aktualny wynik: " + processor.getWinCount() + ":" + processor.getLoseCount());
            System.out.println("Czy chcesz zakonczyc? Y - tak, N - nie");
            String response = scanner.nextLine();
            response = response.toUpperCase();
            switch (response) {
                case "Y": {
                    end = true;
                    System.out.println("Koniec gry. Wynik: " + processor.getWinCount() + ":" + processor.getLoseCount());
                    break;
                }
                case "N": {
                    switch (initializer.getMovesRange()) {
                        case 3: {
                            System.out.println("twoj ruch: R - kamien, P - papier, S - nozyce");
                            break;
                        }
                        case 5: {
                            System.out.println("twoj ruch: R - kamien, P - papier, S - nozyce, W - studnia, B - bomba");
                            break;
                        }
                        default: {
                            System.out.println("Nieznany zestaw ruchow");
                            end = true;
                        }
                    }

                    int random = generator.nextInt(initializer.getMovesRange());
                    try {
                        Move yuourMove = maker.yourMove(scanner.nextLine(), initializer.getMovesRange());
                        Move myMove = maker.myMove(random);
                        processor.process(yuourMove, myMove);
                    } catch (Exception e) {
                        System.out.println("BadInputException: Wprowadz poprawna wartosc");
                    }
                    if(processor.getWinCount() >= initializer.getGameLength() || processor.getLoseCount() >= initializer.getGameLength()) {
                        end = true;
                        System.out.println("Koniec gry. Wynik: " + processor.getWinCount() + ":" + processor.getLoseCount());
                    }
                    break;
                }
                default:
                    System.out.println("Wpisz Y, lub N");
            }

        }
    }
}
