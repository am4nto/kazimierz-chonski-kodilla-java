package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {


    public static void main(String[]args){
        System.out.println("Witaj");
        boolean end = false;
        MoveMaker maker = new MoveMaker();
        MoveProcessor processor = new MoveProcessor();
        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();


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
                    System.out.println("twoj ruch: R - kamien, P - papier, S - nozyce");
                    int random = generator.nextInt(3);
                    try {
                        Move yuourMove = maker.yourMove(scanner.nextLine());
                        Move myMove = maker.myMove(random);
                        processor.process(yuourMove, myMove);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                }
                default:
                    System.out.println("Wpisz Y, lub N");
            }
        }
    }
}
