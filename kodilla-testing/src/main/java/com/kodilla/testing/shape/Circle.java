package com.kodilla.testing.shape;

import java.lang.Math;

public class Circle implements Shape {
    private double r;
    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public double getField() {
        return (Math.PI*r*r);
    }

    public Circle(double r) {
        this.r = r;
    }
}
