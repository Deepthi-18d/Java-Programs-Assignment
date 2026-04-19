<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Second Page</title>
</head>
<body>

<h1>Display the session value on this page</h1>

<%
String name = (String) session.getAttribute("user");

if(name == null) {
    out.print("<h3 style='color:red;'>Sorry, the session has ended</h3>");
} else {
    out.print("<h3>Hello " + name + "</h3>");
}
%>

</body>
</html>