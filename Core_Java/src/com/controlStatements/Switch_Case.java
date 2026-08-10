package com.controlStatements;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number 1 : ");
		int a = sc.nextInt();
		
		System.out.println("Enter Number 2 : ");
		int b = sc.nextInt();
		
		System.out.println("***********Menu***********");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		System.out.println("Enter Your Choice : ");
		int ch = sc.nextInt();
		
		switch (ch) {
		case 1: {
			System.out.println("Addition is : "+(a+b));
			break;
		}
		case 2: {
			System.out.println("Substraction is : "+(a-b));
			break;
		}
		case 3: {
			System.out.println("Multiplication is : "+(a*b));
			break;
		}
		case 4: {
			System.out.println("Division is : "+(a/b));
			break;
		}
		default:
			System.out.println("Enter Valid Choice");
		}
	}

}
