package com.kodilla.testing.calculator;

public class Calculator {
    int a;
    int b;

    public Calculator(){
        this.a = 0;
        this.b = 0;
    }

    public int add(int a, int b ){
        return(a+b);
    }

    public int substract(int a, int b ) {
        return (a - b);
    }
}
