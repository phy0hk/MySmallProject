const canvas = document.getElementById("canvas");
const context = canvas.getContext("2d");
var window_height = window.innerHeight;
var window_width = window.innerWidth;

canvas.width = 500;
canvas.height = 500;

canvas.style.background = "skyblue";

setInterval(function(){
    var i = 0;
    if(i<500){
        context.fillStyle = "red";
     context.fillRect(100, i, 5, 5);
     context.fillStyle = "skyblue";
     context.fillRect(100,i-1,5,5);
    
    }
});


// for (var i = 0; i < 500; i++) {
//     context.fillStyle = "red";
//     context.fillRect(100, i, 5, 5);
//     context.fillStyle = "skyblue";
//     context.fillRect(100,i-1,5,5);
    
// }