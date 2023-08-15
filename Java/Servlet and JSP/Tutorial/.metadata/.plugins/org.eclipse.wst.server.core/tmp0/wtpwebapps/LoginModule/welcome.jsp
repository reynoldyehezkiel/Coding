<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>

	<%
	
		// HTTP 1.1
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	
		// HTTP 1.0
		response.setHeader("Pragma", "no-cache");
		
		// Proxies
		response.setHeader("Expires", "0");
	
		if(session.getAttribute("username")==null)
			response.sendRedirect("login.jsp");
	%>

	Welcome ${username}
	
	<a href="videos.jsp">Videos here</a>
	
	<form action="Logout">
		<input type="submit" value="Logout">
	</form>
</body>
</html>