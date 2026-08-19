<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="PageDirective.jsp">
Enter Number : <input type=text name=num><br>
<input type=submit>
</form>
<% 
	Date d = new Date();
	out.print("Today Date : " + d);
	
	String a = request.getParameter("num");
	out.print(a);
%>

</body>
</html>