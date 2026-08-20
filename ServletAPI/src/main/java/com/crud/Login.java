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

@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		try {
			if(email == null || password == null) {
				out.print("Email and Password Can't be empty");
			}
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Atharva$311");
			
			PreparedStatement ps = con.prepareStatement("select * from login");
			ResultSet rs = ps.executeQuery();
			boolean login = false;
			while(rs.next()) {
				if(email.equals(rs.getString("email")) && password.equals(rs.getString("password"))) {
					login = true;
					break;
				}
			}
			if(login) {	
				response.sendRedirect("BookRegistration.html");
			}
			else {
				response.sendRedirect("LoginPage.html");
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
