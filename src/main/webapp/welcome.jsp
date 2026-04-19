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
String timeStr = request.getParameter("time");

if(name == null || name.trim().equals("") ||
   timeStr == null || timeStr.trim().equals("")) {

    out.print("<h3 style='color:red;'>Please enter valid details</h3>");
} else {

    int time = Integer.parseInt(timeStr);

    // Store in session
    session.setAttribute("user", name);

    // Set session expiry
    session.setMaxInactiveInterval(time);

    out.print("<h2>Hello " + name + "!</h2>");
    out.print("<br>Session started successfully.");

    out.print("<br>Session expiry time: " + time + " seconds");

    out.print("<br><br>Click below within time OR wait to see session expiry:");
}
%>

<br><br>
<a href="check.jsp">Check Session</a>

</body>
</html>