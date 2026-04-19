package com.example;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/VisitServlet")
public class VisitServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("uname");

        Cookie[] cookies = request.getCookies();

        String userName = null;
        int count = 0;

        // Read existing cookies
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("user")) {
                    userName = c.getValue();
                }
                if (c.getName().equals("count")) {
                    count = Integer.parseInt(c.getValue());
                }
            }
        }

        // If new user
        if (name != null && !name.isEmpty()) {
            userName = name;
            count = 0;
        }

        // Increment visit count
        count++;

        // Create cookies
        Cookie nameCookie = new Cookie("user", userName);
        Cookie countCookie = new Cookie("count", String.valueOf(count));

        // Set expiry (Demo: 30 seconds)
        nameCookie.setMaxAge(30);
        countCookie.setMaxAge(30);

        response.addCookie(nameCookie);
        response.addCookie(countCookie);

        // HTML Output
        out.println("<html><body>");

        if (userName != null) {
            out.println("<h2 style='color:blue;'>Welcome back " + userName + "!</h2>");
            out.println("<h3 style='color:green;'>You have visited this page " + count + " times</h3>");
        } else {
            out.println("<h3 style='color:red;'>Please enter your name</h3>");
        }

        // Display all cookies
        out.println("<h3>Active Cookies:</h3>");

        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println("Name: " + c.getName() + " | Value: " + c.getValue() + "<br>");
            }
        }

        out.println("<br><a href='index.html'>Go Back</a>");

        out.println("</body></html>");
    }
}