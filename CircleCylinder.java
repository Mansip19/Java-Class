package com.javademo;

abstract class Shape {
    abstract void draw();
    abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle");
        // Code to draw a circle
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing Cylinder");
        // Code to draw a cylinder
    }

    @Override
    double calculateArea() {
        // Total surface area of a cylinder = 2πr^2 + 2πrh
        return (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height);
    }
}

public class CircleCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Cylinder cylinder = new Cylinder(3, 6);

        circle.draw();
        System.out.println("Area of Circle: " + circle.calculateArea());

        cylinder.draw();
        System.out.println("Total Surface Area of Cylinder: " + cylinder.calculateArea());
    }
}

