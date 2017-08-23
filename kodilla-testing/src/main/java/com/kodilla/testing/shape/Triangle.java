package com.kodilla.testing.shape;

public class Triangle implements Shape {
    String shapeName;
    double a;
    double h;

    public Triangle(String shapeName, double a, double h) {
        this.shapeName = shapeName;
        this.a = a;
        this.h = h;
    }
    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
    public double getA() {
        return a;
    }
    public double getH() {
        return h;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        if (Double.compare(triangle.a, a) != 0) return false;
        if (Double.compare(triangle.h, h) != 0) return false;
        return shapeName.equals(triangle.shapeName);
    }
    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName.hashCode();
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(h);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public String getShapeName() {
        return "Triangle";
    }
    @Override
    public double getField() {
        return (0.5 * a) * h;
    }
    @Override
    public String toString() {
        return "This is : " + shapeName;
    }
}