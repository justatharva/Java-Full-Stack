package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.sun.net.httpserver.Request;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/LoginPage")

public class LoginPage  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String user = req.getParameter("myname");
		String pass = req.getParameter("mypass");
		boolean result = Validation.validate(user, pass);
		
		if(result) {
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.forward(req, resp);
		}
		else {
			RequestDispatcher r = req.getRequestDispatcher("LoginPage.html");
			r.include(req, resp);
			out.println("<title>Login Unsuccessful</title>");
			out.println("<p>Wrong Username and Password</p>");
		}
	}
}
