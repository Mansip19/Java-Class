package com.classdemo;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);

        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());
        
        circle.setRadius(8);
        System.out.println("New radius: " + circle.getRadius());
        System.out.println("New area: " + circle.calculateArea());
        System.out.println("New circumference: " + circle.calculateCircumference());
    }
}
