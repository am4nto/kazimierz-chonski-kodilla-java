package com.kodilla.testing.shape;

public class Square implements Shape {

    private double a;
    @Override
    public String getShapeName() {
        return "square";
    }
    @Override
    public double getField() {
        return (a*a);
    }

    public Square(double a) {
        this.a = a;
    }
}
