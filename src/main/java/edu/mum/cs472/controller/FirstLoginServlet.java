package edu.mum.cs472.controller;
import com.google.gson.Gson;
import edu.mum.cs472.dao.DAO;
import edu.mum.cs472.model.Customer;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/firstLogin")
public class FirstLoginServlet extends HttpServlet {
    HttpSession session = null;

    DAO data;
    Gson mapper = new Gson();

    @Override
    public void init() throws ServletException {
        // initiating connection to data source
        data = new DAO();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Convert the received data (login credentials) to Customer class to be able to handle it
        Customer user = mapper.fromJson(request.getParameter("user"), Customer.class);

        // extract UN & PW from the received&converted object
        String userName = user.getUserName();
        String password = user.getPassword();
        List<Customer> customers = data.getCustomerList();
        Customer client = null;

        // Check if UN & PW are in the registered users
        for(Customer c : customers){
            if(userName.equals(c.getUserName()) &&
                    password.equals(c.getPassword())){
                    client = c;
                    break;
            }
        }

        if(client != null){
            String message = "success";
            PrintWriter out = response.getWriter();
            out.print(mapper.toJson(message));
        }else {
            String message = "Invalid User Name or Password";
            PrintWriter out = response.getWriter();
            out.print(mapper.toJson(message));
        }
    }

}
