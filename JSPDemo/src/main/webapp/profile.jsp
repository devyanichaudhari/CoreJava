<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String fname = request.getParameter("fname");
String lname = request.getParameter("lname");
String email = request.getParameter("email");%>
<%="First Name: "+fname+" Last Name:   " +lname+"   Email:   "+email %>
</body>
</html>