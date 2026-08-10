package com.jdbc;
//import com.jdbc.Connectivity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData {
	public static void main(String[] args) throws SQLException {
		Connection con = Connectivity.con();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name : ");
		String name = sc.next();
		
		System.out.print("Enter city : ");
		String city = sc.next();
		
		System.out.print("Enter Age : ");
		int age = sc.nextInt();
		
		System.out.print("Enter Salary : ");
		int salary = sc.nextInt();
		
		PreparedStatement ps = con.prepareStatement("insert into user (name, city, age, salary) values (?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, city);
		ps.setInt(3, age);
		ps.setInt(4, salary);
		int r = ps.executeUpdate();
		if(r>0) {
			System.out.println("Data inserted.....");
		}
		else {
			System.out.println("Data not inserted......");
		}
		PreparedStatement ps1 = con.prepareStatement("select * from user");
		ResultSet rs = ps1.executeQuery();
		while(rs.next()) {
			String name1 = rs.getString("name");
			System.out.println("Name : "+name1);
			
			String city1 = rs.getString("city");
			System.out.println("City : "+city1);
			
			int age1 = rs.getInt("age");
			System.out.println("Age : "+age1);
			
			int salary1 = rs.getInt("salary");
			System.out.println("Salary : "+salary1);
			
			System.out.println("============================");
		}
		
	}
}
