package com.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runtime_Exceptions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values : ");
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
		
			System.out.println("Division : "+(a/b));
			
			//int ar[] = new int[5];
//			System.out.println(ar[5]);
			
//			String str = null;
//			System.out.println(str.length());
			
			String str = "Hello";
			System.out.println(str.charAt(5));
		}
		catch(ArithmeticException | InputMismatchException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Thank You.......");
		}
		System.out.println("Rest OF THE CODE");
		sc.close();
	}
}
//| InputMismatchException | NullPointerException | ArrayIndexOutOfBoundException 