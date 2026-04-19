<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<title>Result Page</title>
</head>
<body>

<h2>Processing Result</h2>

<%
String message = (String) request.getAttribute("message");

if(message != null && message.contains("Error")) {
%>
    <div style="color:red;"><%= message %></div>
<%
} else {
%>
    <div style="color:green;"><%= message %></div>
<%
}
%>

<% if(request.getAttribute("username") != null) { %>
    <h3>Submitted Data:</h3>
    <p>Username: <%= request.getAttribute("username") %></p>
    <p>Email: <%= request.getAttribute("email") %></p>
    <p>Designation: <%= request.getAttribute("designation") %></p>
<% } %>

<br>
<a href="index.jsp">Back to Form</a>

</body>
</html>