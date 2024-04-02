package com.innerdemo;
//Java Inner Classes
class OuterClass
{
	int x=10;
	
	class InnerClass//nested class//inner class
	{
		int y=5;
	}
}

public class InnerMain {

	public static void main(String[] args) {
		OuterClass outer=new OuterClass();
		OuterClass.InnerClass inner=outer.new InnerClass();
		System.out.println(outer.x);
		System.out.println(inner.y);
		System.out.println(inner.y + outer.x);
		
	}

}
