$(function() {

    $("#run").click(function() {
        runCase();
    });

    $("#about").click(function() {
        showAbout();
    });

});

function runCase() {
    $.ajax({
        url: 'SandboxServlet',
        data: {
            action: 'post',
            text: "This should be the raw text, which will be compiled"
                /*text: $("#inputTxt").val()*/
        },
        error: function() {
            showMessage();
        },
        success: (data) => {
            callback(data);
        },
        type: 'POST',
        dataType: "json"
    });
};

function showMessage() {
    $("#headerModalMessage").css("background-color", "#E74C3C");
    $("#titleModalMessage").text("Error");
    $("#messageText").text("There was an error running the case.");
    $("#modalMessage").modal("show");
}

function showAbout() {
    $("#headerModalMessage").css("background-color", "#A7CB68");
    $("#titleModalMessage").text("ABOUT");
    $("#messageText").text("Bla bla");
    $("#modalMessage").modal("show");
}