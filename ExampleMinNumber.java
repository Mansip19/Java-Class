package com.classdemo;

public class ExampleMinNumber {

	public int minFunction(int n, int m)//n=a, m=b
	{
		int min;
		if(n>m)
		{
			min=m;
		}
		else
		{
			min=n;
		}
		return min;
	}
	public static void main(String[] args) {
		int a=11;
		int b=6;
		

		ExampleMinNumber eg=new ExampleMinNumber();
		
		int c=eg.minFunction(a,b);
		
		System.out.println("Minimum Value "+c);
	}

}

