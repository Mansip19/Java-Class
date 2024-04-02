package com.demo;
//Same name of method and same parameter list also but appearing in different derived classes called method overriding
class ABC
{
	public void add(int a, int b)//Method Overriding
	{
		System.out.println("From ABC class");
	}
	
}
class PQR extends ABC
{
	public void add(int a, int b) 
	{
		System.out.println("From PQR class");
	}
}
public class Calculator2 {

	public static void main(String[] args) {
		
		ABC a=new ABC();
		a.add(2, 5);//parent class(ABC)
		
		ABC a1=new PQR();//up-casting//reference created of parent class ABC//child to parent
		a1.add(2, 5);
		
		PQR p=new PQR();
		p.add(2, 5);
		
		PQR p1=(PQR)new ABC();//incompatible down casting//parent to child
		p1.add(10, 20);
		
		

	}

}
