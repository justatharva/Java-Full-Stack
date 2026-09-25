package com.SessionTracking;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SessionTracking/URLServlet2")
public class URLServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("Welcome Back URL Servlet<br>");
		
		String n = request.getParameter("MyName");
		String e = request.getParameter("MyEmail");
		
		out.println("Name is "+n+"<br>");
		out.println("Email is "+e+"<br>");
	}
}
