package com.kodilla.testing.shape;

public class Triangle implements Shape {
    double baseLength;
    double heigth;
    String shapeName;

    public Triangle(double baseLength, double heigth, String shapeName) {
        this.baseLength = baseLength;
        this.heigth = heigth;
        this.shapeName = shapeName;
    }

    public double getBaseLength() {
        return baseLength;
    }

    public double getHeigth() {
        return heigth;
    }

    public String getShapeName() {
        return shapeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.baseLength, baseLength) != 0) return false;
        if (Double.compare(triangle.heigth, heigth) != 0) return false;
        return shapeName.equals(triangle.shapeName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(baseLength);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(heigth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + shapeName.hashCode();
        return result;
    }

    public double getField() {
        double field;
        field =(baseLength * heigth)/2;
        return field;
    }
}
