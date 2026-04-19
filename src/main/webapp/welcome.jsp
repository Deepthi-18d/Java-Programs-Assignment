<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>

<%
String name = request.getParameter("uname");

// Fix: handle empty input
if(name == null || name.trim().equals("")){
    out.print("<h3 style='color:red;'>Please enter a valid name</h3>");
} else {

    out.print("Welcome! " + name);
    out.print("<br>Session has started ... " + name);

    session.setAttribute("user", name);
    out.print("<br>Your name has been stored in session object");

    session.setMaxInactiveInterval(60); // 60 seconds
    out.print("<br>One minute is set for the session expiry");

    out.print("<br>Click below within 1 minute or wait to see session expiry:<br>");
}
%>

<br>
<a href="second.jsp">Display the value</a>

</body>
</html>