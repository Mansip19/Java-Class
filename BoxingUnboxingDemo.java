package com.javademo;

public class BoxingUnboxingDemo {

	public static void main(String[] args) {
		//Boxing
		byte b=10;
		Byte B=new Byte(b);
		
		short s=10;
		Short S=new Short(s);
		
		//Auto-boxing
		byte b1=10;
		Byte B1=b1;
		
		//UnBoxing
		Byte B2=new Byte((byte)10);
		byte b2=B2.byteValue();
		
		//Auto-unboxing
		Byte B3=new Byte((byte)10);
		byte b3=B3;

	}

}
