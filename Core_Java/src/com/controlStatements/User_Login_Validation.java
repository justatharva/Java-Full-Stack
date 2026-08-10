package com.controlStatements;

import java.util.Scanner;

public class User_Login_Validation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String validusername = "AtharvaG04";
		String validpass = "Atharva";
		System.out.println("Enter Username: ");
		String username = sc.next();
		
		System.out.println("Enter Password: ");
		String password = sc.next();
		
		if(username.equals(validusername) && password.equals(validpass)) {
			System.out.println("Username and password is Valid");
		}
		else {
			System.out.println("Username and password is not valid");
		}
	}

}
