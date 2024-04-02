package com.javacore.demo;

public class ArrayInJava {

	public static void main(String[] args) {
	
		int[] a= {12, 21,0, 5,7};
		int[] b=new int[a.length];
		
		for(int i=0; i<a.length;i++)
		{
			b[i]=a[i];             
		}
		a[2]=56;
		System.out.println(b[2]);
		
		b[4] = 100; 
		
	}
		
		

}



