package com.demo;

public class Calculator {
	
	int a, b, result;
	
	public void add(int a, int b)
	{
		result=a+b;
		System.out.println(result);
	}
	public void add(int a, int b, int c)
	{
		result=a+b+c;
		System.out.println(result);
	}
	public void add(int a, int b, int c, int d)
	{
		result=a+b+c;
		System.out.println(result);
	}
	public static void main(String[] args)
	{
		Calculator cal=new Calculator();
		cal.add(2, 3);
		cal.add(2, 5, 7, 3);
		cal.add(3, 5, 9);
	}

}
