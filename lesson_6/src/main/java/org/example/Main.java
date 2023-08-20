package org.example;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        double perimeterSum = 0;
        Triangle triangle = new Triangle(4, 5, 8);
        System.out.printf("The area of the triangle is %.2f", triangle.findTheArea());
        Rectangle rectangle = new Rectangle(5.0, 6.5);
        System.out.printf("\nThe area of the rectangle is %.2f", rectangle.findTheArea());
        Circle circle = new Circle(5.8);
        System.out.printf("\nThe area of the circle is %.2f", circle.findTheArea());
        Triangle triangle1 = new Triangle(4.1, 8.2, 4.1);
        Circle circle1 = new Circle(6.5);
        Circle[] figures = new Circle[5];
        figures[0] = circle;
        figures[1] = circle1;
        figures[2] = new Circle(4.3);
        figures[3] = new Circle(2.2);
        figures[4] = new Circle(4.1);
        for(int i = 0; i < figures.length; i++){
            perimeterSum += figures[i].findThePerimeter();
        }
        System.out.printf("\nThe sum of perimeters for figures in array = %.2f", perimeterSum);
    }
}
