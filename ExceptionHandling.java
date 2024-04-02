package com.java;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Statement Executes");
        try
        {
		Integer i=new Integer("abc");//NumberFormat Exception
        }
        catch(NumberFormatException ns)
        {
        	System.out.println("String value");
        }
		//int a="abc";
		
		System.out.println("Statement not Executes");
		

	}

}
