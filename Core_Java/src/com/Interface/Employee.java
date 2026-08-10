package com.Interface;
import java.util.Scanner;
interface Client{
	void input();
	void output();
}

class Developer implements Client{

	String empName;
	double salary;
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name : ");
		empName = sc.next();
		
		System.out.println("Enter Salary : ");
		salary = sc.nextDouble();
		
	}

	@Override
	public void output() {
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Salary : "+salary);
	}
	
}

public class Employee {
	public static void main(String[] args) {
		Developer d = new Developer();
		d.input();
		d.output();
	}
}
