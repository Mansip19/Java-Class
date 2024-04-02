package com.demo;
//Cricket is-a game//is-a relationship//by inheritance
class Game
{
	public void Type()
	{
		System.out.println("Indoor and Outdoor");
	}
}
class Carrom extends Game
{
	public void Type()
	{
		System.out.println("Carrom is a indoor");
	}
}
public class Cricket extends Game 
{
	public void Type()
	{
		System.out.println("Cricket is a Outdoor");
	}

	public static void main(String[] args) {
		Game gm=new Game();
		gm.Type();//call game class method
		
		Cricket ck=new Cricket();
		ck.Type();//call cricket class
		
		Game gm1=new Game();
		gm1.Type();//call game class
		
		Game gm2=new Cricket();//gm refers to cricket object
		gm2.Type();//call cricket class
		
		gm=ck;//gm refers to cricket object
		gm.Type();//call cricket class

	}

}
