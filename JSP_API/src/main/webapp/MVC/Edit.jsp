<%@page import="com.userbean.Addinfo"%>
<%@page import="com.userbean.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="a" class="com.userbean.Addinfo"></jsp:useBean>
    <jsp:useBean id="u1" class="com.userbean.UserDao"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Data</title>
</head>
<body>
<h1> Update Here </h1>
<form action="Update.jsp">

<%

String id = request.getParameter("uid");

int eid = Integer.parseInt(id);

Addinfo u = UserDao.getByUserId(eid);

%>
<form action=Update.jsp">
<input type="text" name="id" value=<%=u.getId() %>><br><br>
<input type="text" name="myname" value=<%=u.getMyname() %>><br><br>
<input type="text" name="myemail" value=<%=u.getMyemail() %>><br><br>
<input type="text" name="mycity" value=<%=u.getMycity() %>><br><br>
<input type="text" name="myage" value=<%=u.getMyage() %>><br><br>
<input type="submit" value="Update">
</form>

</form>
</body>
</html>