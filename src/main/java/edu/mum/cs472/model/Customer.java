package edu.mum.cs472.model;

public class Customer {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String country;
    private String postalCode;
    private String email;
    private String phone;
    private Payment payment;
    private Booking booking;
    private String userName;
    private String password;

    public Customer() {
    }

    public Customer(String firstName, String lastName,
                    String streetAddress, String city,
                    String state, String country, String postalCode,
                    String email, String phone,
                    Payment payment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.country = country;
        this.postalCode = postalCode;
        this.email = email;
        this.phone = phone;
        this.payment = payment;
    }

    public Customer(String firstName, String lastName,
                    String streetAddress, String city,
                    String state, String country, String postalCode,
                    String email, String phone, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.country = country;
        this.postalCode = postalCode;
        this.email = email;
        this.phone = phone;
        this.userName = userName;
        this.password = password;
    }

    public Customer(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
