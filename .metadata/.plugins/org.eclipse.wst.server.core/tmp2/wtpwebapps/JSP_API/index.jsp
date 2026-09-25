<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Hello JSP</h1>
<!-- Scriptlet Tag -->
<%
	int a = 10;
	out.print(a);
	
	int sum = addition(10,5);
	out.print(sum);
%>

<!-- Declaration Tag -->
<%!
	int addition(int x, int y){
		return x+y;
	}
%>

<!-- Expression Tag -->

<%=
	"Addition is "+addition(20,80)
%>

</body>
</html>