package com.exceptionHandling;

import java.util.Scanner;

public class ATMException {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 11000;
		try {
			System.out.println("Enter amount to withdraw : ");
			int amount = sc.nextInt();
			if(amount==10000) {
				balance -= amount;
				throw new Exception("You have Reached Daily withdrawl limit....");
			}
			else if(amount>10000) {
				throw new Exception("You Daily amount withdrawl limit is 10000, You cannot withdraw amount");
			}
			else {
				balance-=amount;
				System.out.println("Amount of Rs."+amount+" is successfully withdrawl");
				System.out.println("Your current balance is Rs."+balance);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
