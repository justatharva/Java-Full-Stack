package com.userbean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	public static Connection con = null;
	public static PreparedStatement ps = null;
	public static ResultSet rs = null;
	
	public static Connection conn() {
		try {			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Atharva$311");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	}
	
	public static void main(String[] args) {
		conn();
	}
	
	public static int SaveUser(Addinfo a) {
		conn();
		int r = 0;
		try {
			ps = con.prepareStatement("insert into user (name,email,city,age) values (?,?,?,?)");			
			ps.setString(1, a.getMyname());
			ps.setString(2, a.getMyemail());
			ps.setString(3, a.getMycity());
			ps.setInt(4, a.getMyage());
			
			r = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return r;
	}
	
	public static Addinfo getByUserId(int id) {
		conn();
		
		Addinfo a = new Addinfo();
		try {
			ps = con.prepareStatement("Select * from user where id = ?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int uid = rs.getInt("id");
				a.setId(uid);
				a.setMyname(rs.getString("name"));
				a.setMyemail(rs.getString("email"));
				a.setMycity(rs.getString("city"));
				a.setMyage(rs.getInt("age"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
		
	}
	
	public static int updateData(Addinfo a) {
		conn();
		int rs= 0;
		try {
			ps = con.prepareStatement("Update user set name=?, email=?, city=?, age=? where id=?");
			ps.setString(1, a.getMyname());
			ps.setString(2, a.getMyemail());
			ps.setString(3, a.getMycity());
			ps.setInt(4, a.getMyage());
			ps.setInt(5, a.getId());
			rs = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
		
	}
	
	public static List<Addinfo> getAllUsers(){
		conn();
		List<Addinfo> list = new ArrayList<Addinfo>();
		
		try {
			ps = con.prepareStatement("select * from user");
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Addinfo a = new Addinfo();
				
				a.setId(rs.getInt("id"));
				a.setMyname(rs.getString("name"));
				a.setMyemail(rs.getString("email"));
				a.setMycity(rs.getString("city"));
				a.setMyage(rs.getInt("age"));
				list.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
