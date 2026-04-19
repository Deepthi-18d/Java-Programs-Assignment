<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session Input</title>
</head>
<body>

<h2>Start Session</h2>

<form action="welcome.jsp" method="get">
    Enter your name: 
    <input type="text" name="uname"><br><br>

    Enter session expiry time (in seconds): 
    <input type="text" name="time"><br><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>