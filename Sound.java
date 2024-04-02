package com.package1;
class Animal2
{
	public void makeSound()
	{
		System.out.println("Animal makes sound");
	}
}
class Cat extends Animal2
{
	public void makeSound()
	{
		System.out.println("Cat meows");
	}
}
public class Sound 
{
   public static void main(String[] args) 
   {
	Animal2 animal=new Animal2();
	Cat cat=new Cat();
	animal.makeSound();
	cat.makeSound();
   }

}
