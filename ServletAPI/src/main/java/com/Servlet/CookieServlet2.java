package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/CookieServlet2")
public class CookieServlet2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		Cookie[] c1 = req.getCookies();
		
		out.println("Name is : "+c1[0].getValue());
//		out.println("Email is : "+c1[1].getValue()+"<br><br>");
//		out.println("City is : "+c1[3].getValue()+"<br><br>");
	}
}
