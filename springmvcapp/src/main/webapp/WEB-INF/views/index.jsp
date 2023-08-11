<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to the Home Page</h1>
	<p>this is spring mvc web application</p>
	
	<% //scriptlet tag
		String name = (String) request.getAttribute("name"); //this came from home controller
	
	%>
	
	<h3>Name is <%=name%></h3> <!-- expression tag is used to show the dynamic value to the user -->
</body>
</html>