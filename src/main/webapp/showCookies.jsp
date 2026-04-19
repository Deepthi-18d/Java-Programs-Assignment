<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<%@ page import="javax.servlet.http.Cookie" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Active Cookies</title>
</head>
<body>

<h2>Active Cookie List</h2>

<%
Cookie[] cookies = request.getCookies();

if(cookies != null) {
    for(Cookie c : cookies) {
        out.print("<b>Name:</b> " + c.getName() + "<br>");
        out.print("<b>Value:</b> " + c.getValue() + "<br>");
        out.print("<hr>");
    }
} else {
    out.print("<h3>No active cookies found</h3>");
}
%>

<br>
<a href="index.jsp">Back</a>

</body>
</html>