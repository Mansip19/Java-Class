package com.javacore.demo;
import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   
		  System.out.print("Enter the 1st number: ");
		  int num1 = sc.nextInt();
		   
		  System.out.print("Enter the 2nd number: ");
		  int num2 = sc.nextInt();
		   
		  System.out.print("Enter the 3rd number: ");
		  int num3 = sc.nextInt();
		   
		   
		  if (num1 > num2)
		   if (num1 > num3)
		    System.out.println("Greatest number is: " + num1);
		   
		  if (num2 > num1)
		   if (num2 > num3)
		    System.out.println("Greatest number is: " + num2);
		   
		  if (num3 > num1)
		   if (num3 > num2)
		    System.out.println("Greatest number is: " + num3);

	}

}
