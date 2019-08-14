<%--
  Created by IntelliJ IDEA.
  User: bereketabraham
  Date: 2019-08-14
  Time: 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Room</title>
    <link href="resources/css/searchInput.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="resources/js/searchInput.js"></script>
</head>
<body>
<div id="container">

    <div class="top">
        <h1>My Luxury Hotel</h1>
        <nav>
            <ul>
                <li><a href="index.jsp">Home</a></li>
                <li><a href="searchInput.jsp" class="active">Search rooms</a></li>
                <li><a href="review.jsp">Reviews</a></li>
                <li ${logged}><a href="login.jsp">Login</a></li>
                <%--                <li><a href="#">SignUp</a></li>--%>
                <li><a href="#">Contact</a></li>
            </ul>
        </nav>
    </div>

    <div class="banner">
        <form id="searchForm" method="post" action="search">
            <fieldset id="mainSearch">
                Check In: <input id="checkIn" name="checkIn" type="date" placeholder="Select Checkin Date" size="20" required/>
                Check Out: <input id="checkOut" name="checkOut" type="date" placeholder="Select Checkout Date" size="20" required/>
                Room Type:
                <select id="type" name="type">
                    <option value="single" selected>Single</option>
                    <option value="double">Double</option>
                    <option value="twin">Twin</option>
                    <option value="triple">Triple</option>
                </select>
                View:
                <select id="view" name="view">
                    <option value="lake" selected>Lake View</option>
                    <option value="city">City View</option>
                </select>
            </fieldset>
            <fieldset id="specialFilter">
                <legend>Extras</legend>
                <label>Gym & Sauna Access <input id="gym" name="gym" type="checkbox" value="gym"/></label>
                <label>Parking Included <input id="parking" name="parking" type="checkbox" value="parking"/></label>
            </fieldset>
            <button id="check" type="button">Check Availability</button>
            <%--            <label>Check Availability<input id="check" type="checkbox"></label>--%>
            <fieldset id="messageDisplay">
                Here!
            </fieldset>
            <input id="submitBtn" type="submit" value="NEXT">
        </form>
    </div>
    <footer>Copyright 2019</footer>
</div>
</body>
</html>
