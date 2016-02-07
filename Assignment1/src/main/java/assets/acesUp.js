// Javascript functionality
// Linking HTML file to ApplicationController.java file

var game;

function display(game){
    console.log(game);

    $( 'columnOfCards .cardLocation' ).html("");
    $.each(game.cols[0], function(key, val) {
        $( '#c1 .l'+key ).html(val.value + " of " + val.suit);
    });
    $.each(game.cols[1], function(key, val) {
        $( '#c2 .l'+key ).html(val.value + " of " + val.suit);
    });
    $.each(game.cols[2], function(key, val) {
        $( '#c3 .l'+key ).html(val.value + " of " + val.suit);
    });
    $.each(game.cols[3], function(key, val) {
        $( '#c4 .l'+key ).html(val.value + " of " + val.suit);
    });
}

$.getJSON("http://localhost:8080/AcesUp", function( data ) {
    display(data);
    game = data;
});

$('#dealButton').click(function () {
    alert(game);
    $.ajax({
        type: "POST",
        url: "/dealCard",
        data: JSON.stringify(game),
        success: function(data, status){
            console.log("Data: " + data + "\nStatus: " + status);
            console.log("Deal button success");
            game = data;
            display(data);
        },
        contentType: "application/json; charset=utf-8",
        dataType: "json",
    });
});

$('#restartButton').click(function () {
    alert(game);
    $.ajax({
        type: "GET",
        url: "/initializeGame",
        data: JSON.stringify(game),
        success: function(data, status){
            console.log("Data: " + data + "\nStatus: " + status);
            console.log("Deal button success");
            game = data;
            display(data);
        },
        contentType: "application/json; charset=utf-8",
        dataType: "json",
    });
});