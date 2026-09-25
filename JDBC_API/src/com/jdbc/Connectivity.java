package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity {
	public static Connection con() throws SQLException {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "Atharva$311");
			
			if(con!=null) {
				System.out.println("Connection Established.....");
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
