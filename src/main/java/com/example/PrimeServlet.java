//Build a servlet program to check the given number is prime number or not using HTML with step by
//step procedure.
package com.example;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get input
        String numStr = request.getParameter("num");
        int num = Integer.parseInt(numStr);

        boolean isPrime = true;

        // Prime logic
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output
        out.println("<html><body>");

        if (isPrime) {
            out.println("<h2 style='color:green;'>" + num + " is a Prime Number</h2>");
        } else {
            out.println("<h2 style='color:red;'>" + num + " is NOT a Prime Number</h2>");
        }

        out.println("<a href='index.html'>Check another number</a>");
        out.println("</body></html>");
    }
}
