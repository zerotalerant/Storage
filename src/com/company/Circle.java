    package com.company;

public class Circle {
    private int numberOfCircles;
    private final double radius;
    private double square;

    public Circle(int numberOfCircles, double radius, double square) {
        this.numberOfCircles = numberOfCircles;
        this.radius = radius;
        this.square = square;
    }

    private double getSquare() {
        final double PI = 3.14;
        return PI * radius * radius;
    }

    public double getNumberOfCircles() {
        return (int) (getSquare() % 3);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Радиус = " + radius;
    }
}
