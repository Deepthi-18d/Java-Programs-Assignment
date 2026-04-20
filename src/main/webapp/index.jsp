//Construct a Cookie Management program using JSP to get the fields Name, Domain and Max
//Expiry Age ( in sec) and press the button Add Cookie for displaying the set cookie information.
//Then it has to go to show the active cookie list when you press the link go to the active cookie list
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cookie Management</title>
</head>
<body>

<h2>Add Cookie</h2>

<form action="addCookie.jsp" method="post">
    Name: <input type="text" name="cname"><br><br>
    Domain: <input type="text" name="cdomain"><br><br>
    Max Expiry Age (sec): <input type="text" name="cage"><br><br>

    <input type="submit" value="Add Cookie">
</form>

</body>
</html>
