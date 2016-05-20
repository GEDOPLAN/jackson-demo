function sendJSON(data) {
    var request = new XMLHttpRequest();
    request.open("POST", "rest/extended");
    request.setRequestHeader("Content-Type", "application/json; charset=UTF-8");
    request.send(data);
}