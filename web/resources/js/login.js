"use strict";

$(document).ready() (function () {
    document.getElementById("btn").onclick = loginFunction;
});

function loginFunction() {
    var un = $("#userName").val();
    var pw = $("#password").val();
    var userObj = {"userName":un, "password":pw};
    $.post('firstLogin', {user:JSON.stringify(userObj)}, myFunction, "json");
}

function myFunction(data) {
    if(data == "success"){
        $("#submitBtn").click();
    }else{
        var msgDiv = document.getElementById("warn");
        msgDiv.innerHTML = data;
        msgDiv.style.display = "block";
    }
}