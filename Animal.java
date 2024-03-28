package com.package1;
class Animal1 
{
    public void move() 
    {
        System.out.println("Animal moves");
    }
}
class Cheetah extends Animal1 
{
    public void move() 
    {
        System.out.println("Cheetah is running");
    }
}
public class Animal 
{
    public static void main(String[] args) 
    {
        Animal1 a = new Animal1();
        Cheetah c = new Cheetah();
        a.move();
        c.move();
    }

}
