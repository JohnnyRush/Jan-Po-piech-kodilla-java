package com.kodilla.testing.shape;

public class Circle implements Shape {
    double ray;
    String shapeName;

    public Circle(double ray, String shapeName) {
        this.ray = ray;
        this.shapeName = shapeName;
    }

    public double getRay() {
        return ray;
    }
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.ray, ray) != 0) return false;
        return shapeName.equals(circle.shapeName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(ray);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + shapeName.hashCode();
        return result;
    }
    public double getField(){
        double field;
        field = 3.14 * ray;
        return field;

    }

}

