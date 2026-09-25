package com.inheritance;

import java.util.Scanner;

public class Data {
	int a,b;
	
	public void data() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a : ");
		a = sc.nextInt();
		
		System.out.println("Enter value of b : ");
		b = sc.nextInt();
	}
}
