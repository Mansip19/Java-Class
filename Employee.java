package com.classdemo;

public class Employee {
	   String name;
	   String jobTitle;
	   double salary;

	  public Employee(String name, String jobTitle, double salary) {
	    this.name = name;
	    this.jobTitle = jobTitle;
	    this.salary = salary;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getJobTitle() {
	    return jobTitle;
	  }

	  public void setJobTitle(String jobTitle) {
	    this.jobTitle = jobTitle;
	  }

	  public double getSalary() {
	    return salary;
	  }

	  public void setSalary(double salary) {
	    this.salary = salary;
	  }

	  public void calculateSalary(double percentage) {
	    salary = salary + salary * percentage / 100;
	  }

	  public void printEmployeeDetails() {
	    System.out.println("Name: " + name);
	    System.out.println("Job Title: " + jobTitle);
	    System.out.println("Salary: " + salary);
	  }
	
	  public static void main(String[] args) {

	    Employee employee1 = new Employee("Mansi Patil", "HR Manager", 40000);
	    Employee employee2 = new Employee("Pooja Patil", "Software Engineer", 60000);
	    System.out.println("\nEmployee Details:");
	    employee1.printEmployeeDetails();
	    employee2.printEmployeeDetails();

	    employee1.calculateSalary(8);
	    employee2.calculateSalary(12);

	    System.out.println("\nAfter calculating salary:");
	    System.out.println("\n8% for Mansi Patil:");
	    employee1.printEmployeeDetails();
	    System.out.println("\n12% for Pooja Patil:");
	    employee2.printEmployeeDetails();
	  }
	}