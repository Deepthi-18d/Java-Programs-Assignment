<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Check Session</title>
</head>
<body>

<h2>Session Status</h2>

<%
String name = (String) session.getAttribute("user");

if(name == null) {
    out.print("<h3 style='color:red;'>Session Expired!</h3>");
} else {
    out.print("<h3 style='color:green;'>Hello " + name + " (Session Active)</h3>");
}
%>

<br>
<a href="index.jsp">Start Again</a>

</body>
</html>