<%@page import="com.userbean.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="a" class="com.userbean.Addinfo"></jsp:useBean>
<%

int r = UserDao.updateData(a);

if(r>0){
	out.print("Data Updated");
}
else{
	out.print("Data is not Updated");
}

%>

</body>
</html>