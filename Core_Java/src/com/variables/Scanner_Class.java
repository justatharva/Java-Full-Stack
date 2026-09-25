package com.variables;
import java.util.Scanner;
public class Scanner_Class {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer: ");
		int i = sc.nextInt();
		System.out.println("Number is "+i);
		System.out.println("Enter Float: ");
		float f = sc.nextFloat();
		System.out.println("Number is "+f);
		System.out.println("Enter Double: ");
		double d = sc.nextDouble();
		System.out.println("Number is "+d);
		System.out.println("Enter Long: ");
		long l = sc.nextLong();
		System.out.println("Long is "+l);
		System.out.println("Enter Character: ");
		char c = sc.next().charAt(1);
		System.out.println("Character is "+c);
		System.out.println("Enter Boolean: ");
		boolean b = sc.nextBoolean();
		System.out.println("Boolean Value is "+b);
		System.out.println("Enter String: ");
		String s = sc.next();
		System.out.println("String is "+s);
	}

}
