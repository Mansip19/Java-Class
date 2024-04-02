package com.javacore.demo;
import java.util.Scanner;

public class ShippingCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Choose your shipping method");
		System.out.println("1. Standard shipping");
		System.out.println("2. Express shipping");
		System.out.println("3. Overnight shipping");
		
        int shippingMethod=sc.nextInt();
        
        int basecost=10;
        
        switch(shippingMethod)
        {
        case 1:
        	
        }
	}

}
