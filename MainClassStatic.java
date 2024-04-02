package com.classdemo;

class StaticBlock{

static int staticVariable;

static
{
	System.out.println("Static Component SIB(Static Initialization Block)");
	staticVariable=10;
}
static void staticMethod()
{
	System.out.println("From Static Method");
	System.out.println(staticVariable);
}
}
public class MainClassStatic{
	static
	{
		System.out.println("Main class SIB");
	}
	public static void main(String[] args) {
		StaticBlock.staticVariable=20;
		StaticBlock.staticMethod();
		}
}

