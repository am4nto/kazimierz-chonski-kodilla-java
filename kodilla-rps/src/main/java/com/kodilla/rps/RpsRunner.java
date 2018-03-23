package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {


    public static void main(String[]args){
        System.out.println("Witaj");
        boolean end = false;
        MoveMaker maker = new MoveMaker();
        MoveProcessor processor = new MoveProcessor();
        Scanner scanner = new Scanner(System.in);


        while (!end){
            System.out.println("Czy chcesz zakonczyc? Y - tak, N - nie");
            String response = scanner.nextLine();
            response = response.toUpperCase();
            switch (response) {
                case "Y": {
                    end = true;
                    break;
                }
                case "N": {
                    System.out.println("twoj ruch: R - kamien, P - papier, S - nozyce");
                    try {
                        Move yuourMove = maker.yourMove(scanner.nextLine());
                        Move myMove = maker.myMove();
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
