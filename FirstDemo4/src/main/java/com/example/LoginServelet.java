package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServelet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                           HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String correctUsername = "Nushra";
        String correctPassword = "1234";

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        if (username.equals(correctUsername) &&
            password.equals(correctPassword)) {

            out.println("<h2>Login Successful!</h2>");
            out.println("<p>Welcome, " + username + "</p>");

        } else {

            out.println("<h2>Invalid Username or Password</h2>");
            out.println("<a href='login.html'>Try Again</a>");
        }
    }
}