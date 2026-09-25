package com.exceptionHandling;

import java.util.Scanner;

public class RailwayReservation {
	public static void main(String[] args) {
		int availableseats = 5;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter how many seats are booking");
			int seats = sc.nextInt();
			
			if(seats>availableseats) {
				throw new Exception("Sorry Seats are not available");
			}
			System.out.println("Your booking successfully.....");
			availableseats = availableseats-seats;
			System.out.println("Available seats are : "+availableseats);
			sc.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Thank you for visiting railway reservation");
		}
		System.out.println("Happy Journey");
	}
}
