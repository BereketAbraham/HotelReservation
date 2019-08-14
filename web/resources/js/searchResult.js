"use strict"
window.onload = function () {
    document.getElementById("bookBtn").onclick = goToBooking;
    document.getElementById("backBtn").onclick = goToSearch;
};

function goToBooking() {
    window.location.replace ('booking.jsp');
}

function goToSearch() {
    window.history.back();
}