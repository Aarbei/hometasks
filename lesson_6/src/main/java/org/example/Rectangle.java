package org.example;

public class Rectangle extends Shape{
    private double side1,side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double findThePerimeter() {
        double Perimeter = (side1 + side2)*2;
        return Perimeter;
    }

    @Override
    public double findTheArea() {
        double area = side1 * side2;
        return area;
    }
}
