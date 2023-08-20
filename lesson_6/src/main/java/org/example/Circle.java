package org.example;

import static java.lang.Math.PI;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double findThePerimeter() {

        double Perimeter = 2 * PI * radius;
        return Perimeter;
    }

    @Override
    public double findTheArea() {
        double area = PI * Math.pow(radius,2);
        return area;
    }
}
