package com.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		response.setContentType("text/html");
    		PrintWriter out = response.getWriter();
    		
    		String name = request.getParameter("MyName");
    		String email = request.getParameter("MyEmail");
    		String password = request.getParameter("MyPassword");
    		String city = request.getParameter("MyCity");
    		
    		out.println("Name is "+name+"<br>");
    		out.println("Email is "+email+"<br>");
    		out.println("City is "+city+"<br>");
    		
    		Cookie cookie1 =  new Cookie("name", name);
    		response.addCookie(cookie1);
    		Cookie cookie2 =  new Cookie("Email", email);
    		response.addCookie(cookie2);
    		Cookie cookie3 =  new Cookie("City", city);
    		response.addCookie(cookie3);
    		Cookie cookie4 =  new Cookie("Password", password);
    		response.addCookie(cookie4);
    		
    		out.println("<a href='CookieServlet2'> click here</a>");
    	}

}
