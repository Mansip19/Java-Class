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
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class CalculateArea {
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        Square square = new Square(5);
        Triangle triangle = new Triangle(5, 7);

        circle.draw();
        System.out.println("Area of Circle: " + circle.calculateArea());

        square.draw();
        System.out.println("Area of Square: " + square.calculateArea());

        triangle.draw();
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}



