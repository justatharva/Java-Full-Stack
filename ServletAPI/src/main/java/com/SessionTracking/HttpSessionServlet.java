package com.SessionTracking;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HttpSessionServlet")
public class HttpSessionServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("Welcome HTTP Session Servlet<br>");
		String name = request.getParameter("Myname");
		String email = request.getParameter("MyEmail");
		String city = request.getParameter("MyCity");
		String age = request.getParameter("MyAge");
		
		out.print("Name is "+name+"<br>");
		out.print("Email is "+email+"<br>");
		out.print("City is "+city+"<br>");
		out.print("Age is "+age+"<br>");
		
		HttpSession h = request.getSession();
		h.setAttribute("Myname ", name);
		h.setAttribute("MyEmail", email);
		h.setAttribute("MyCity", city);
		h.setAttribute("MyAge", age);
		
		out.print("<a href='HttpSessionServlet2'>Click ME</a>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
