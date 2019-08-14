"use strict";

$(function () {
    $("#btn").click(loginFunction); // Attach event to the login button.
});

/**
 * Collecting login credentials and sending them to the servlet in an ajax call
 */
function loginFunction() {
    var un = $("#userName").val();
    var pw = $("#password").val();
    var userObj = {"userName": un, "password": pw};
    $.post('firstLogin',
        {user:JSON.stringify(userObj)},
        chkLogin,
        "json");
}

/**
 * Result of the ajax call if it succeeds
 * @param data the returned data from the servlet in response to the ajax call
 */
function chkLogin(data) {
    // If login succeeded click the submit button
    if(data == "success"){
        $("#submitBtn").click();
    }else{
    // if the login fails show the warning message
        var msgDiv = $("#warn");
        msgDiv.text(data);
        msgDiv.removeClass("warn-hide");
        msgDiv.addClass("warn-show");
    }
}