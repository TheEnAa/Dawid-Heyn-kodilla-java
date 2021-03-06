package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName;
    private double r;

    public Circle(String shapeName, double r) {
        this.shapeName = shapeName;
        this.r = r;
    }
    public double getR() {
        return r;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        if (Double.compare(circle.r, r) != 0) return false;
        return shapeName.equals(circle.shapeName);
    }
    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName.hashCode();
        temp = Double.doubleToLongBits(r);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public String getShapeName() {
        return "Circle";
    }
    @Override
    public double getField() {
        return 3.14 * (r*r);
    }
    @Override
    public String toString() {
        return "This is : " + shapeName;
    }
}