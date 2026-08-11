package com.SessionTracking;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SessionTracking/HiddenServlet")
public class HiddenServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("Welcome Hidden servlet<br>");
		
		String n = request.getParameter("MyName");
		String e = request.getParameter("MyEmail");
		
		out.print("Name is "+n+"<br>");
		out.print("Email is "+e+"<br>");
		
		out.print("<form action='HiddenServlet2' method='get'>");
		out.print("<input type = 'hidden' name = 'Name' value = "+n+">");
		out.print("<input type = 'hidden' name = 'Email' value = "+e+">");
		out.print("<input type = 'submit'>");
		out.print("</form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
