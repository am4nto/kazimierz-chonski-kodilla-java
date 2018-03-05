package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static boolean end;
    public static void scan() throws BadInputException{
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //System.out.println(input);
        if (input.equals("R")) {

        } else if (input.equals("P")) {

        } else if (input.equals("S")) {

        } else if (input.equals("E")) {
            end = true;
        } else throw new BadInputException("Wprowadz poprawna wartosc");
    }
    public static void main(String[]args){
        System.out.println("Witaj");

        end = false;

        while (!end){
            System.out.println("twoj ruch: R - kamien, P - papier, S - nozyce, E - koniec");
            try {
                scan();
            } catch (Exception e){
                System.out.println(e);
            }finally {

            }


        }
    }
}
