package com.kodilla.testing.shape;

public class Square implements Shape {
    double sideLength;
    String shapeName;

    public Square(double sideLength, String shapeName) {
        this.sideLength = sideLength;
        this.shapeName = shapeName;
    }

    public double getSideLength() {
        return sideLength;
    }
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.sideLength, sideLength) != 0) return false;
        return shapeName.equals(square.shapeName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(sideLength);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + shapeName.hashCode();
        return result;
    }

    public double getField(){
        double field;
        field = sideLength * sideLength;
        return field;
    }
}
