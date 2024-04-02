package com.classdemo;

class SampleDemo
{
	int x=5;
	
	public void SampleDemoMethod()
	{
		System.out.println("Value of x for SampleDemoMethod "+ x);
	}
}
public class SampleSecond { 

	int x=10;    
	
	public void method1() 
	{		
		System.out.println("Value of x for method 1 "+ x); 
	}
	public void method2()  
	{		
		System.out.println("Value of x for method 2 "+ x); 
	}
	public static void main(String[] args) { 
		SampleSecond ss1=new SampleSecond();
		ss1.method1(); 
		ss1.method2();
		
		SampleDemo sm=new SampleDemo();
		sm.SampleDemoMethod();
	}

}

