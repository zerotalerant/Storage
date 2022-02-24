package com.company;

public class Circle {
    private double radius;
    private static final double PI = 3.14;
    int count = 0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void square() {
        double y = PI * radius * 2;
        if ((y % 3) == 0) {
            System.out.println("Круги, Y которых кратен 3: " + y);
            count++;
        } else {
            System.out.println("Площадь: " + y);
        }
    }
}
