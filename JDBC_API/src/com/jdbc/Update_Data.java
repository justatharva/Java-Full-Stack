package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update_Data {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "Atharva$311");
		System.out.print("Enter Name : ");
		String name = sc.next();
		
		System.out.print("Enter Id : ");
		int id = sc.nextInt();
		
		PreparedStatement ps = con.prepareStatement("update user set name = ? where id = ?");
		ps.setString(1, name);
		ps.setInt(2, id);
		int r = ps.executeUpdate();
		if(r > 0) {
			System.out.println("Data Updated Successfully...");
		}
		else {
			System.out.println("Data Not Updated...");
		}
		sc.close();
	}
}
