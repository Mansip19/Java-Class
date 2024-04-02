package com.package1;
class Vehicle1
{
    public void drive() 
    {
        System.out.println("Repairing a vehicle");
    }
}
class Car extends Vehicle1 
{
   public void drive() 
    {
        System.out.println("Repairing a car");
    }
}
public class Vehicle{
public static void main(String[] args) 
{
    Car car = new Car();
    car.drive(); 

}
}
