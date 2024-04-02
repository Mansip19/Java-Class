package com.stringdemo;

public class StringComparison {
	
	public static void main(String[] args) {
		
		String s1="0-42L";
		String s2="0-43-";
		
		System.out.println(s1 == s2);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode()==s2.hashCode());
		
	}

}
