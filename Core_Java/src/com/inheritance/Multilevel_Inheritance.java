package com.inheritance;

class Employee{
	int id;
	String name;
	
	public void data() {
		System.out.println("Employee id is : "+id);
		System.out.println("Employee Name is : "+name);
	}
}

class Dev extends Employee{
	int salary;
	
	public void data() {
		System.out.println("Employee id is : "+id);
		System.out.println("Employee Name is : "+name);
		System.out.println("Employee Salary is : "+salary);
	}
}

class Manager extends Dev{
	int teamsize;
	
	public void data() {
		System.out.println("Employee id is : "+id);
		System.out.println("Employee Name is : "+name);
		System.out.println("Employee Salary is : "+salary);
		System.out.println("TeamSize is : "+teamsize);
	}
}

public class Multilevel_Inheritance {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.id = 101;
		m.name = "Atharva";
		m.salary = 20000;
		m.teamsize = 6;
		
		m.data();
	}
}
