package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Calculator {
    @Autowired
    private Display display;

    public void displayVal(double value) {
        display.displayValue(value);
    }

    public double add (double a, double b) {
        return a + b;
    }

    public double sub (double a, double b) {
        return a - b;
    }

    public double mul (double a, double b) {
        return a * b;
    }

    public double div (double a, double b) {
        return a / b;
    }
}
