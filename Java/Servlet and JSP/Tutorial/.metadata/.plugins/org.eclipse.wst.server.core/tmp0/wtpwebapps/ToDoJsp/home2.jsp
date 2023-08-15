<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
	<!-- Import package-->
	<%@ page import='java.util.ArrayList' %>
	<%@page import="java.util.Scanner"%>
	
	<!-- Include file -->
 	<%@ include file="header.jsp" %>
 	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Page</title>
</head>
<body>
	<%
		int coef = 3;
		// Scanner
	%>

	<h1>Hello World!</h1>
	<%
		int i = 9;
		out.println(7+5);
	%>
	
	My Fav Number is : <%= coef %>
</body>
</html>