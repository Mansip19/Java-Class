package com.javacore.demo;

/*
 * Arrays we have mentioned till now are called one-dimensional arrays.
 *  In Java, you can declare an array of arrays known as 
 *  multidimensional array. Here's an example to
 *  declare and initialize multidimensional array.
 */
public class ArrayInJava6 {

	public static void main(String[] args) {
		
		 double[][] matrix= { // declaration, instatiation and intilization of double type array
				{1.2,4.3,4.0},  
				{4.1,1.1},
				{2.3}			
		};
/*			  colunm1        colunm2      colunm3
 * 				 1				2			3
 * 		rows1 matrix[0][0] matrix[0][1] matrix[0][2]
 * 		rows2 matrix[1][0] matrix[1][1] matrix[1][2]
 * 		rows3 matrix[2][0] matrix[2][1] matrix[2][2]	
 * 
 * 			matrix[0][0]=1.2
 * 			matrix[1][1]=1.1
 * 			mayrix[2][0]=2.3
 * 			
 * 
 * 
		double[][] matrix1;//declaration of two dimentinal array
		
		double[][] a=new double[3][2]; //instatiation
		
		int[][] a1=new int[3][2];
		String[][] a2=new String[3][2];*/
		
		int[][] a= {
				{1,2,3},
				{4,5,6,9},
				{7}
			};
		System.out.println("length of row 1" +a[0].length);//3
		System.out.println("length of row 2" +a[1].length);//4
		System.out.println("length of row 3" +a[1].length);//1
		System.out.println(a[0][0]); 
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		
		
		//print all the matrix
		}
	
}

