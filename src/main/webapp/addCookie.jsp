<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<%@ page import="javax.servlet.http.Cookie" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cookie Added</title>
</head>
<body>

<%
String name = request.getParameter("cname");
String domain = request.getParameter("cdomain");
String ageStr = request.getParameter("cage");

if(name == null || name.trim().equals("") ||
   ageStr == null || ageStr.trim().equals("")) {

    out.print("<h3 style='color:red;'>Please enter valid details</h3>");
} else {

    int age = Integer.parseInt(ageStr);

    // Create cookie
    Cookie cookie = new Cookie("user", name);

    // Set properties
    cookie.setMaxAge(age);

    if(domain != null && !domain.trim().equals("")) {
        cookie.setDomain(domain);
    }

    // Add cookie to response
    response.addCookie(cookie);

    // Display cookie info
    out.print("<h2>Cookie Created Successfully!</h2>");
    out.print("<b>Name:</b> " + name + "<br>");
    out.print("<b>Domain:</b> " + domain + "<br>");
    out.print("<b>Expiry Age:</b> " + age + " seconds<br>");
}
%>

<br><br>
<a href="showCookies.jsp">Go to Active Cookie List</a>

</body>
</html>