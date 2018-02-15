package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        return shapes.get(n);
    }

    public ArrayList<String> showFigures(){
        ArrayList<String> figures = new ArrayList<String>();
        for (Shape shape: shapes) {
            figures.add(shape.getShapeName());
            System.out.println(shape);
        }
        return figures;

    }

    public int getShapesQuantity(){
        return shapes.size();
    }
}
