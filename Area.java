package com.package1;
class Shape 
{
    public int getArea() 
    {
        return 0;
    }
} 
class Rectangle extends Shape 
{
     int length;
     int width;
    
    public Rectangle(int length, int width) 
    {
        this.length = length;
        this.width = width;
    }
  
    public int getArea() 
    {
        return length * width;
    }
}
public class Area 
{

	public static void main(String[] args)
	{
		Rectangle rectangle = new Rectangle(2, 10);
	    int area = rectangle.getArea();
	    System.out.println("The area of the rectangle is: " + area);

	}

}

