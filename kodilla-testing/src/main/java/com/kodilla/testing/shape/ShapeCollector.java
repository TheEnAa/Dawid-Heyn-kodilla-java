package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> list = new ArrayList<Shape>();
    public void addFigure(Shape shape){
        list.add(shape);
    }
    public void removeFigure(Shape shape) {
        list.remove(shape);
    }
    public Shape getFigure(int n) {
        Shape figure = null;
        if (n >= 0 && n < list.size()) {
            figure = list.get(n);
        }
        return figure;
    }
    public void showFigures(int n) {
        System.out.println(list.get(n));
    }
    public int listSize() {
        return list.size();
    }
}
