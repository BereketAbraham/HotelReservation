package edu.mum.cs472.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/logout")
public class LogOutServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // end the session, erase current user from session attributes and cookies, and go back to the index page
        request.getSession().invalidate();
        HttpSession session = request.getSession();
        session.setAttribute("name", "");
        for (Cookie c : request.getCookies()) {
                if (c.getName().equals("userCookie")) {
                    c.setMaxAge(0);
                break;
            }
        }
        response.sendRedirect("index.jsp");
    }
}
