package com.exceptionHandling;

import java.util.Scanner;

public class IllegalOTPTest{
	public static void main(String[] args) throws IllegalOTP{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your OTP : ");
		String otp = sc.next();
		
		String totp = "123456";
		
		if(otp.equals(totp)) {
			System.out.println("Access Allowed.....");
		}
		else {
			throw new IllegalOTP("Access Denied!!!!");
		}
		System.out.println("Rest Of The Code");
	}
}
