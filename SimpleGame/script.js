const canvas = document.getElementById("canvas");
const c = canvas.getContext("2d");
var window_height = window.innerHeight;
var window_width = window.innerWidth;

canvas.width = 500;
canvas.height = 500;

canvas.style.background = "skyblue";

let xpos = 10;
let ypos = 0;
function getMousePos(canvas,event){
    const rect = canvas.getBoundingClientRect();
    const x = event.clientX - rect.left;
    const y = event.clientY - rect.top;
     xpos = x;
    ypos = y;
}

function Draw(){
    c.clearRect(xpos,ypos-10,10,10);
    c.fillRect(xpos,ypos,10,10);
    ypos += 5;
}
function Draw(){
    if(ypos<=490){
    c.fillStyle = "skublue";
    c.clearRect(xpos,ypos-10,10,10);
    c.fillStyle = "black";
    c.fillRect(xpos,ypos,10,10);
    ypos += 5;
    }
    else{
        c.fillRect(xpos,ypos,10,10)
    }
}

canvas.addEventListener('mousedown',function(e){
    getMousePos(canvas,e);
})
setInterval(Draw,10);
