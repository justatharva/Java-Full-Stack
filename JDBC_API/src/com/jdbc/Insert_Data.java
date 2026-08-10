package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert_Data {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Registered..");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "Atharva$311");
		System.out.println("Connection Successful....");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name : ");
		String name = sc.next();
		
		System.out.print("Enter City : ");
		String city = sc.next();
		
		System.out.print("Enter Age : ");
		int age = sc.nextInt();
		
		System.out.print("Enter Salary : ");
		int salary = sc.nextInt();
		
		PreparedStatement ps = con.prepareStatement("insert into user (name,city,age,salary) values (?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, city);
		ps.setInt(3, age);
		ps.setInt(4, salary);
		
		int r = ps.executeUpdate();
		
		if(r > 0) {
			System.out.println("Data inserted Successfully...");
		}
		else {
			System.out.println("Data is not inserted");
		}
		sc.close();
	}
}
