package edu.mum.cs472.dao;

import edu.mum.cs472.model.Booking;
import edu.mum.cs472.model.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DAO {

    List<Room> roomList = new ArrayList<>();
    List<Booking> bookingList = new ArrayList<>();
    List<Customer> customerList = new ArrayList<>();

    {
        //creating rooms
        Room r1 = new Room("R1","single",50,"lake");
        Room r2 = new Room("R2","single",50,"lake");
        Room r3 = new Room("R3","single",50,"city");
        Room r4 = new Room("R4","double",70,"city");
        Room r5 = new Room("R5","double",70,"lake");
        Room r6 = new Room("R6","double",70,"city");
        Room r7 = new Room("R7","twin",90, "lake");
        Room r8 = new Room("R8","twin",90,"city");
        Room r9 = new Room("R9","triple",150,"lake");
        Room r10 = new Room("R10","triple",150,"city");

        //adding rooms to rooms list
        roomList.add(r1);
        roomList.add(r2);
        roomList.add(r3);
        roomList.add(r4);
        roomList.add(r5);
        roomList.add(r6);
        roomList.add(r7);
        roomList.add(r8);
        roomList.add(r9);
        roomList.add(r10);

        //creating some bookings
        bookingList.add(new Booking(LocalDate.of(2019,7,16), LocalDate.of(2019,7,20), r2));
        bookingList.add(new Booking(LocalDate.of(2019,7,21), LocalDate.of(2019,7,24), r10));

        //creating customers
        Customer customer1 = new Customer("Yosief", "Teklemariam", "55 Main St.", "Fairfield", "Iowa", "United States", "55677", "yosief@example.com", "776-786-9898","yosief","1234");
        Customer customer2 = new Customer("Bereket", "Abraham", "44 Main St.", "Fairfield", "Iowa", "United States", "55677", "bereket@example.com", "677-786-9898","bereket","4321");
        Customer customer3 = new Customer("Aser", "Ahmad", "44 Main St.", "Fairfield", "Iowa", "United States", "55677", "aser@example.com", "677-786-9898","aser","1234");
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

}
