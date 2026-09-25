package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Alter_Table_and_Columns {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		try {
			Connection con = Connectivity.con();
			int ch;
			do {
				System.out.println("=================Table Operations==============");
				System.out.println("1. Rename Table");
				System.out.println("2. Add Column");
				System.out.println("3. Drop Column");
				System.out.println("4. Rename Column");
				System.out.println("5. Exit");
				System.out.print("Enter Choice : ");
				ch = sc.nextInt();
				switch(ch) {
				case 1:
					System.out.print("Enter Old Table Name : ");
					String oldname = sc.next();
					System.out.print("Enter New Table Name : ");
					String newname = sc.next();
					String sql1 = "ALTER TABLE " + oldname + " RENAME TO " + newname;
					PreparedStatement ps1 = con.prepareStatement(sql1);
					ps1.executeUpdate();
					System.out.println("Table name changed Successfully...");
					break;
				case 2:
					System.out.print("Enter Table Name : ");
					String tname = sc.next();
					System.out.print("Enter Column Name : ");
					String colname = sc.next();
					System.out.print("Enter Datatype : ");
					String dtype = sc.next();
					String sql2 = "alter table "+tname+" add "+colname+" "+dtype;
					System.out.println(sql2);
					PreparedStatement ps2 = con.prepareStatement(sql2);
					ps2.executeUpdate();
					System.out.println("Column added Successfully...");
					break;
				case 3:
					System.out.print("Enter Table Name : ");
					String tname1 = sc.next();
					System.out.print("Enter Column Name : ");
					String colname1 = sc.next();
					String sql3 = "alter table "+tname1+" drop column "+colname1;
					PreparedStatement ps3 = con.prepareStatement(sql3);
					ps3.executeUpdate();
					System.out.println("Column Dropped Successfully...");
					break;
				case 4:
					System.out.print("Enter Table Name : ");
					String tname3 = sc.next();
					System.out.print("Enter Old Column Name : ");
					String oldcolname = sc.next();
					System.out.print("Enter New Column Name : ");
					String newcolname = sc.next();
					String sql4 = "alter table "+tname3+" rename column "+oldcolname+" to "+newcolname;
					PreparedStatement ps4 = con.prepareStatement(sql4);
					ps4.executeUpdate();
					System.out.println("Column name Changed Successfully....");
					break;
				case 5: 
					System.out.println("Exit Successful.....");
					break;
				}
			}while(ch!=5);
			
		}catch(SQLException e) {
			System.out.println("Error : "+e);
		}
		finally {
			sc.close();
		}
	}
}
