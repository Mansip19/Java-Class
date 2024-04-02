package com.javacore.demo;
import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		/*int i=10;
		if(i < 15)
		{
			System.out.println("inside the if statement");
			System.out.println("10 is less than 15");
		}*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of i");
		int i = sc.nextInt();
		if(i == 10)
		{
		 System.out.println("i is 10");	
		}
		else if(i == 15)
		{
			System.out.println("i is 15");
		}
		else if(i == 20)
		{
			System.out.println("i is 20");
		}
		else
		{
			System.out.println("i is not present");
		}



	}

}
