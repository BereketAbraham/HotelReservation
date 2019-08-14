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
        data = new DAO();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        Customer user = mapper.fromJson(req.getParameter("user"), Customer.class);

        String userName = user.getUserName();
        String password = user.getPassword();
        List<Customer> customers = data.getCustomerList();
        Customer client = null;

        for(Customer c : customers){
            if(userName.equals(c.getUserName())){
                if(password.equals(c.getPassword())){
                    client = c;
                    break;
                }
            }
        }

        if(client != null){
            String message = "success";
            PrintWriter out = resp.getWriter();
            out.print(mapper.toJson(message));
        }else {
            String message = "Invalid User Name or Password";
            PrintWriter out = resp.getWriter();
            out.print(mapper.toJson(message));
        }
    }

}
