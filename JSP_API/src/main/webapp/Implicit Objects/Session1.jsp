<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session 1</title>
</head>
<body>
<%
String name = request.getParameter("myname");
String email = request.getParameter("myemail");
String city = request.getParameter("mycity");

out.print("Name is "+name+"<br>");
out.print("Email is "+email+"<br>");
out.print("City is "+city+"<br>");


session.setAttribute("n",name);
session.setAttribute("e",email);
session.setAttribute("c",city);
%>

<a href="Session2.jsp">Click Me</a>

</body>
</html>