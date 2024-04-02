package com.package1;

public class ThisClass {

	int a;
	int b;
	int c;
	
	  ThisClass() 
	  { 
		  this(10,20);
	  	  System.out.println("Inside Default constrictor");
	  }
	  ThisClass(int a, int b)
	  { 
		  this(10,20,30); 
		  this.a=a; 
		  this.b=b;
		  System.out.println("inside the Parameterized constructor- 1");
	  }
	  ThisClass(int a, int b, int c) 
	  { 
		  this.a=a; 
		  this.b=b;
		  this.c=c;
	 
		  System.out.println("inside the Parameterized constructor - 2"); 
	}
	 
	public static void main(String[] args) {
		ThisClass tiss=new ThisClass();
		//tiss.display();
		//ThisClass tis=new ThisClass(20,30);

	}

}
