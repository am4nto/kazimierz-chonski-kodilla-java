package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        int number1 = 3;
        int number2 = 2;
        Calculator calculator = new Calculator(number1,number2);
        if (calculator.add() == (number1 + number2)){
                System.out.println("Adding OK");
        }
            else{
            System.out.println("Adding error");
            }
        if (calculator.substract() == (number1 - number2)){
                System.out.println("Substracting OK");
        }
    }
}