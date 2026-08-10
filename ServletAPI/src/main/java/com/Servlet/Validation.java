package com.Servlet;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/Validation")
public class Validation {
	public static boolean validate(String u, String p) {
		if(u.equals("Admin") && p.equals("Admin@123")) {
			return true;
		}
		else {
			return false;
		}
	}
}
