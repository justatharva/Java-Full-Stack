package com.crud;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/SignUp")
public class SignUp extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confirm_password = request.getParameter("confirmPassword");
		
		try {
			if(email == null || password == null || confirm_password == null) {
				out.print("Email and Password Can't be empty");
			}
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Atharva$311");
			
			
			PreparedStatement ps = con.prepareStatement("select * from login");
			ResultSet rs = ps.executeQuery();
			boolean login = false;
			while(rs.next()) {
				if(email.equals(rs.getString("email"))) {
					login = true;
					break;
				}
			}
			if(login) {	
				out.print("Email Already Exist");
			}
			else if (password.equals(confirm_password)){
				PreparedStatement ps1 = con.prepareStatement("insert into login (email, password) values (?, ?)");
				ps1.setString(1, email);
				ps1.setString(2, password);
				int r =  ps1.executeUpdate();
				response.sendRedirect("BookRegistration.html");
			}
			else {
				out.print("<h1>Password Doesn't match with confirm password</h1><br><a href='SignUp.html'>Go Back</a>");
			}
			
		} catch (Exception e) {
			out.print(e);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
