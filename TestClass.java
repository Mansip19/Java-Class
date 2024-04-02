package com.package1;
class Student
{
	int rollno;//instance variable
	String name;
	float fee;
	
    Student(int rollno, String name, float fee)//parameter list
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rollno + " " + name + " " + fee);
	}
}
public class TestClass {

	public static void main(String[] args) {
		Student s1=new Student(1, "Mansi", 1000.0f);
		Student s2=new Student(2, "Om", 2000.0f);
		s1.display();
		s2.display();

	}

}
