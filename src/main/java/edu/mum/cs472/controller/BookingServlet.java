package edu.mum.cs472.controller;

import edu.mum.cs472.dao.DAO;
import edu.mum.cs472.model.Booking;
import edu.mum.cs472.model.Customer;
import edu.mum.cs472.model.Payment;
import edu.mum.cs472.model.Room;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@WebServlet(name = "BookingServlet")
public class BookingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession bookSession = request.getSession();

        String temp = request.getParameter("expiration-date");
        // DO THE DATEEEE!
        request.getParameter("billing-address");
        request.getParameter("cvv");

        Payment payment = new Payment(request.getParameter("card-type"),
                request.getParameter("card-provider"), request.getParameter("card-name"),
                request.getParameter("card-number"), LocalDate.of(2019, 6, 5),
                request.getParameter("billing-address"), request.getParameter("cvv"));

        Customer customer = new Customer (request.getParameter("first-name"),
                request.getParameter("last-name"), request.getParameter("street"),
                request.getParameter("city"), request.getParameter("state"),
                request.getParameter("country"), request.getParameter("postal-code"),
                request.getParameter("email"), request.getParameter("phone"),
                payment);

        customer.setPayment(payment);
        payment.setCustomer(customer);

        Room room = (Room) bookSession.getAttribute("room");
        LocalDate checkInDate = (LocalDate) bookSession.getAttribute("checkInDate");
        LocalDate checkOutDate = (LocalDate) bookSession.getAttribute("checkOutDate");

        Booking booking = new Booking(checkInDate, checkOutDate, room, customer);
        //   booking.setBasePrice((double)(bookSession.getAttribute("totalWithTax")));
        bookSession.setAttribute("booking", booking);

        List<Booking> bookingList = new DAO().getBookingList();

        bookingList.add(booking);
        bookSession.setAttribute("bookingList", bookingList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("confirmation.jsp");
        dispatcher.forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
