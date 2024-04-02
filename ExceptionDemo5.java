package com.java;

public class ExceptionDemo5 {

	public static void main(String[] args) {
		int result, a=10, b=0;
		try
		{
		  result=a/b;
		  System.out.println("result" + result);
		}
		
		catch(NullPointerException ae)
		{
			System.out.println("No values in variable");
		}
		finally
		{
		System.out.println("Close all the connections");
		}
		System.out.println("Code executes");
		
	}

}
