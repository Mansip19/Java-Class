package com.stringdemo;

import java.util.Scanner;

public class PatternString {

	public static void main(String[] args) {
		String institute="Mansi Patil";
		
		boolean a=institute.startsWith("ma");
		boolean b=institute.startsWith("Ma");
		boolean c=institute.endsWith("il");
		boolean d=institute.endsWith("Il");

	    System.out.println(" "+a);
	    System.out.println(" "+b);
	    System.out.println(" "+c);
	    System.out.println(" "+d);

		}

}


