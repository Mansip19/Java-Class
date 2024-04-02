package com.javacore.demo;

public class OperatorDemo {

	public static void main(String[] args) {
		System.out.println("Arithmetic Operator");
		int a=10;
		int b=3;
		int result=a+b;
		System.out.println("a + b = " + result);
		System.out.println("a - b = " + ( a - b));
		System.out.println("a / b = " + ( a / b));
		System.out.println("a * b = " + ( a * b));
		System.out.println("a % b = " + ( a % b));
		System.out.println();
		
		System.out.println("Relational Operator");
		System.out.println("a > b = " + (a > b));
		System.out.println("a < b = " + (a < b));
		System.out.println("a >= b = " + (a >= b));
		System.out.println("a <= b = " + (a <= b));
		System.out.println("a == b = " + (a == b));
		System.out.println("a != b = " + (a != b));
		System.out.println();
		
		System.out.println("Bitwise Operator");
		int m=60,n=13;
		result=m & n;
		System.out.println(result);
		
		result=m | n;
		System.out.println(result);
		
		result=m ^ n;
		System.out.println(result);
		
		result=m & n;
		System.out.println(result);
		
		result=m >> 2; 
		System.out.println("m >> 2" + result);
		
		result=m << 2;
		System.out.println("m << 2" + result);
		System.out.println();
		
		System.out.println("Ternary Operator");
		int min=(a<b)? a : b;
		System.out.println(min);
		System.out.println();
		
		System.out.println("Assigment Operator");
		System.out.println("a=a+b " + (a +=b));
		System.out.println("a=a-b " + (a -=b)); 
		System.out.println("a=a*b " + (a *=b)); 
		System.out.println("a=a/b " + (a /=b)); 
		System.out.println();
		
		System.out.println("Increment & Decrement Operator");
		int x=5;
		System.out.println(x);
		x++;
		System.out.println(x); 
		System.out.println(x--);
		System.out.println(x);
		System.out.println();
		
		System.out.println(++x);//pre-increment and post-increment
		System.out.println(x++);
		}

}
