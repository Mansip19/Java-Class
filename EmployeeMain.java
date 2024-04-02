package com.package1;
//Manager is-a employee
class Employee
{
	public int salary;//attribute of employee class
	
	
	public Employee(int sal)//special type of a method - //constructor
	{
		salary=sal;
	}
	
	public void work()//method of employee class
	{
		System.out.println("Working as a employee");
	}
	public int getSalary()
	{
		return salary;
		
	}
}
class Manager extends Employee
{

	public Manager(int sal) 
	{
		super(sal);
	}
	public void work()
	{
		System.out.println("Managing the employee");
	}
	public void addEmployee()
	{
		System.out.println("Adding the new employee");
	}
}

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp=new Employee(40000);
        Manager mar=new Manager(70000);
        
        emp.work();
        System.out.println("Employee Salary: " +emp.getSalary());
        
        mar.work();
        System.out.println("Manager Salary: " +mar.getSalary());
        mar.addEmployee();
        
	}

}
