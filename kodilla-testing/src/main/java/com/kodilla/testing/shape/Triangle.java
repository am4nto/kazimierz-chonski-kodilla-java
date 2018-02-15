package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double a;
    private double h;
    @Override
    public String getShapeName() {
        return "triangle";
    }
    @Override
    public double getField() {
        return (a*h/2);
    }

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }
}
