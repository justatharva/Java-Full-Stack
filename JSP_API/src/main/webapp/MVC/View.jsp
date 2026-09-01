<%@page import="java.util.List"%>
<%@page import="com.userbean.UserDao"%>
<%@page import="com.userbean.Addinfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>

table,th,tr,td{
border : 2px solid red;
border-collapse: collapse;
text-align: center;
padding: 3px;
}

</style>

</head>
<body>
<table style=width:100%>

<%
List <Addinfo> l = UserDao.getAllUsers();
%>
<tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>City</th>
<th>Age</th>
</tr>
<%
for(Addinfo a : l)
{	
%>
<tr>
<td><%=a.getId() %></td>
<td><%=a.getMyname() %></td>
<td><%=a.getMyemail() %></td>
<td><%=a.getMycity() %></td>
<td><%=a.getMyage() %></td>
</tr>
<%
}
%>
</table>

<a href="Addinfo.html">Add Info</a>
<a href="Search.html">Search</a>
<a href="View.jsp">View</a>
</body>
</html>