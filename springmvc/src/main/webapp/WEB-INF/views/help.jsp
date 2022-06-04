<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is help page</h1>

	<!--  String name = (String) request.getAttribute("name");
Integer rollNo = (Integer) request.getAttribute("rollNo");
LocalDateTime time = (LocalDateTime) request.getAttribute("time");
	
%>
<h1>My name is nameame %></h1>
<h1>My roll no is rollNolNo %></h1>
<h1>Date and Time is timeime %></h1>

-->
	<h1>My name is :${name}</h1>
	<h1>My roll no is :${rollNo}</h1>
	<hr>

	<c:forEach var="item" items="${marks}">
		<!-- <h1>${item}</h1>  -->
		<h1><c:out value="${item}"></c:out></h1>
	</c:forEach>
</body>
</html>