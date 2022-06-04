<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is home page</h1>
	<%
	String name1 = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	List<String> friendsList = (List<String>) request.getAttribute("f");
	%>
	<h3>
		My name is :
		<%=name1%></h3>
	<h3>
		My id is :
		<%=id%></h3>
	<%
	for (String s : friendsList) {
	%>

	<h1><%=s%></h1>
	<%
	}
	%>
</body>
</html>