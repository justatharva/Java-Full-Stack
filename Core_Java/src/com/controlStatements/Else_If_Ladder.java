package com.controlStatements;

import java.util.Scanner;

public class Else_If_Ladder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		if(marks>=75 && marks <=100) {
			System.out.println("You are in merit list");
		}
		else if(marks>=60 && marks<75) {
			System.out.println("You are first class");
		}
		else if(marks>=35 && marks<60) {
			System.out.println("You are second class");
		}
		else if(marks<35) {
			System.out.println("You are Failed");
		}
		else {
			System.out.println("Enter Valid Marks");
		}
	}

}
