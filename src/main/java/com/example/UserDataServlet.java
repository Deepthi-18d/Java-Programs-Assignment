package com.example;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/processUser")
public class UserDataServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String designation = request.getParameter("designation");

        String message;

        if (username == null || username.trim().isEmpty()) {
            message = "Error: Username is required";  // FIXED
        } else {
            message = "User data processed successfully";

            request.setAttribute("username", username);
            request.setAttribute("email", email);
            request.setAttribute("designation", designation);
        }

        request.setAttribute("message", message);

        RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.sendRedirect("index.jsp");
    }
}