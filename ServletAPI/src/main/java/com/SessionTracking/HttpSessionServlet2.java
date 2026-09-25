package com.SessionTracking;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HttpSessionServlet2")
public class HttpSessionServlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession h = request.getSession(false);
		
		out.print("Welcome back HTTP Session Servlet<br>");
		String name = (String) h.getAttribute("Myname");
		String email = (String) h.getAttribute("MyEmail");
		String city = (String) h.getAttribute("MyCity");
		String age = (String) h.getAttribute("MyAge");
		
		out.print("Name is "+name+"<br>");
		out.print("Email is "+email+"<br>");
		out.print("City is "+city+"<br>");
		out.print("Age is "+age+"<br>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
