package org.example;

import static java.lang.Math.sqrt;

public class Triangle extends Shape{
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double findTheArea() {
        double halfPer = findThePerimeter() / 2;
        double area = sqrt(halfPer * (halfPer-side1) * (halfPer-side2) * (halfPer - side3));
        return area;
    }

    @Override
    public double findThePerimeter() {

        double Perimeter = side1 + side2 + side3;
        return Perimeter;
    }
}
