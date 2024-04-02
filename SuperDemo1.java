package com.package1;
class SuperParent
{
	String name;
	
	public void details()
	{
		name="Parent";
		System.out.println(name);
	}
}
public class SuperDemo1 extends SuperParent
{
	
	String name;
	
	public void details()
	{
		super.details();
		name="Child";
		System.out.println(name);
	}

	public static void main(String[] args) 
	{
		SuperDemo1 obj=new SuperDemo1();
		obj.details();

	}

}
