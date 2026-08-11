package com.SessionTracking;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SessionTracking/URLServlet")
public class URLServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("Welcome url rewriting form<br>");
		
		String name = request.getParameter("MyName");
		String email = request.getParameter("MyEmail");
		
		out.println("Name is "+name+"<br>");
		out.println("Email is "+email+"<br>");
		
		out.println("<a href='URLServlet2?MyName="+name+"&MyEmail="+email+"'>Click Me</a>");
	}
}
