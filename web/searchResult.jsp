<%--
  Created by IntelliJ IDEA.
  User: bereketabraham
  Date: 2019-08-14
  Time: 12:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Search Result</title>
    <link href="resources/css/searchResult.css" rel="stylesheet">
    <script src="resources/js/searchResult.js"></script>
</head>
<body>
<div id="container">

    <div class="top">
        <h1>My Luxury Hotel</h1>
        <nav>
            <ul>
                <li><a href="index.jsp" class="active">Home</a></li>
                <li><a href="searchInput.jsp">Search rooms</a></li>
                <li><a href="review.jsp">Reviews</a></li>
                <li ${logged}><a href="login.jsp">Login</a></li>
                <%--                <li><a href="#">SignUp</a></li>--%>
                <li><a href="#">Contact</a></li>
            </ul>
        </nav>
    </div>

    <div class="banner">
        <h1 id="message1">${msg1} ${name}</h1>
        <h4 id="message2">${msg2}</h4>
        <div id="container1" ${hide}>
            <div id="image">
                <img src="${picture}"/>
            </div>
            <div id="info">
                <p>Room Type: ${room.type}</p>
                <p>View: ${room.view}</p>
                <p>Daily Base Rate: $ ${baseRate}0</p>
                <p>Extras - Gym: $ ${gymExtra}0</p>
                <p>Extras - Parking: $ ${parkingExtra}0</p>
                <p>Daily with Extras: $ ${totalDaily}0</p>
                <p>Your Stay Total: $ ${totalStay}0</p>
                <p>Applicable Tax: $ ${tax}0</p>
                <p>Total With Tax: $ ${totalWithTax}0</p>
            </div>
            <div id="buttons">
                <button id="backBtn">Refine Search</button>
                <button id="bookBtn">Book This Room</button>
            </div>
        </div>
    </div>

    <footer>Copyright 2019</footer>
</div>

</body>
</html>
