package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;


public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
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
        Shape figure = null;
        if (n >= 0 && n < shapes.size()) {
            figure = shapes.get(n);
        }
        return figure;
    }
    public void showFigures(){
        for(Shape figure : shapes)
            System.out.println(figure.getShapeName());
    }

    public int getFiguresQuantity(){
        return shapes.size();
    }
}
