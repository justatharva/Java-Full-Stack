package com.variables;

public class Variables_Types {
	int b = 15; // Instance Varible
	static int c = 12; // Static Variables
	public static void main(String args[]) {
		int a = 10;
		System.out.println("The value of a : "+a); // Direct Access [ Local Variable ]
		Variables_Types var = new Variables_Types();
		System.out.println("This is instance variable b : "+var.b); // Access through creating Object
		System.out.println("This is Static variable c : "+Variables_Types.c); // Access through class name
	}
}
