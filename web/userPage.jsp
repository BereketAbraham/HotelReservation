<%--
  Created by IntelliJ IDEA.
  User: Aser
  Date: 8/14/2019
  Time: 4:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome, ${name}!</title>
    <link href="resources/css/userPage.css" rel="stylesheet">
</head>
<body>

<div id="container">

    <div class="top">
        <h1>The Luxury Hotel</h1>
        <nav>
            <ul>
                <li><a href="index.jsp" class="active">Home</a></li>
                <li><a href="searchInput.jsp">Search rooms</a></li>
                <li><a href="#">Reviews</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
        </nav>
    </div>

    <%-- logout line --%>
    <div id="logged">
        Logged in as ${name}
        <form action="logout" method="post">
            <input type="submit" value="logout">
        </form>
    </div>

    <%-- Welcome line --%>
    <div id="content">
        <div class="my-div">
            <h1 id="welcome">Welcome to your Homepage, ${name}!</h1><br>
        </div>
        <div class="my-div">
            <a href="searchInput.jsp">Book Your Room</a> and enjoy your membership discount
        </div>
    </div>
</div>
</body>
</html>