package com.javacore.demo;
public class ArrayInJava6 {

	public static void main(String[] args) {
		
		 double[][] matrix= { 
				{1.2,4.3,4.0},  
				{4.1,1.1},
				{2.3}			
		};
		
		int[][] a= {
				{1,2,3},
				{4,5,6,9},
				{7}
			};
		System.out.println("length of row 1" +a[0].length);
		System.out.println("length of row 2" +a[1].length);
		System.out.println("length of row 3" +a[1].length);
		System.out.println(a[0][0]); 
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		
		
		}
	
}

