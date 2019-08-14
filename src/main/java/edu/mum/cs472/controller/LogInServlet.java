package edu.mum.cs472.controller;
import edu.mum.cs472.dao.DAO;
import edu.mum.cs472.model.Customer;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/login")
public class LogInServlet extends HttpServlet {
    HttpSession session = null;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // extract un & pw from the login
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        DAO data = new DAO();
        List<Customer> customers = data.getCustomerList();
        Customer client = null;

        // validate un & pw
        for(Customer c : customers){
            if(userName.equals(c.getUserName()) &&
                password.equals(c.getPassword())){
                client = c;
                break;
            }
        }

        if(client == null){
            request.setAttribute("msg","Invalid username and/or password");
            RequestDispatcher view = request.getRequestDispatcher("login.jsp");
            view.forward(request, response);
        }else {
            HttpSession bookSession = request.getSession();
            bookSession.setAttribute("name", client.getFirstName());
            bookSession.setAttribute("userName", client.getUserName());
            bookSession.setAttribute("password", client.getPassword());
            bookSession.setAttribute("user", client);

            // remember logged-in user
            Cookie c = new Cookie("userCookie", client.getUserName());
            c.setMaxAge(2592000); // one month
            response.addCookie(c);

            String loggedIn = "hidden";
            bookSession.setAttribute("logged", loggedIn);

            // forward the user to the welcome page
            RequestDispatcher rd = request.getRequestDispatcher("userPage.jsp");
            rd.forward(request, response);
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
