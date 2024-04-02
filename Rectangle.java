package com.classdemo;

public class Rectangle {
	  double width;
	  double height;

	  public Rectangle(double width, double height) {
	    this.width = width;
	    this.height = height;
	  }

	  public double getArea() {
	    return width * height;
	  }

	  public double getPerimeter() {
	    return 2 * (width + height);
	  }
	  public static void main(String[] args) {
	    Rectangle rectangle = new Rectangle(5, 10);

	    System.out.println("Area of rectangle: " + rectangle.getArea());
	    System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());
	  }
	}
