<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<title>User Data Form</title>
</head>
<body>

<h2>Enter User Data</h2>

<form action="processUser" method="POST">
    Username: <input type="text" name="username" required><br><br>
    Email: <input type="email" name="email" required><br><br>
    Designation: <input type="text" name="designation" required><br><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>