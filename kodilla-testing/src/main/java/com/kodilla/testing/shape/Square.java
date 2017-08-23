package com.kodilla.testing.shape;

public class Square implements Shape {
    private String shapeName;
    private double a;

    public Square(String shapeName, double a) {
        this.shapeName = shapeName;
        this.a = a;
    }

    public double getA() {
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.a, a) != 0) return false;
        return shapeName.equals(square.shapeName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName.hashCode();
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String getShapeName() {
        return "";
    }

    @Override
    public double getField() {

        return 0;
    }
}
