package com.classdemo;
class A
{
	 int nonStaticVariable;
	 static int staticVariable;
static void staticMethod()
{
	System.out.println(staticVariable);
}
void nonStaticMethod()
{
	System.out.println(staticVariable);
	System.out.println(nonStaticVariable);
}
}
public class MainInstanceClass {
    public static void main(String[] args) {
    	A.staticVariable=10; 
    	A.staticMethod();
    	
    	A a1=new A();
    	A a2=new A();
    	
    	System.out.println(a1.nonStaticVariable);
    	System.out.println(a2.staticVariable);
    	a1.nonStaticMethod();
    	a2.staticMethod();
    	
    	System.out.println(a2.staticVariable);
    	a1.staticVariable=20;
    	System.out.println(a2.staticVariable);
    }
}
