const canvas = document.querySelector("canvas");
const context = canvas.getContext("2d");

const canvas_height = 600;
const canvas_width = 600;

canvas.width = canvas_width;
canvas.height = canvas_height;

// context.fillStyle = "White";
// context.fillRect(0,0,canvas_width,canvas_height);

class Box{
    constructor(x,y,w,h,s){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.s = s;

        this.dx = this.s*1;
        this.dy = 0;
    }
    draw(context){
        context.fillStyle = "black";
        context.fillRect(this.x,this.y,this.w,this.h);
    }
    animate(){
        context.clearRect(this.x+100,this.y,this.w,this.h);
        this.draw(context);
        this.x -= this.dx;
        this.y += this.dy;
    }
}
let test = new Box(500,0,100,200,10);
test.draw(context);

let test0 = new Box(500,400,100,200,10);
test0.draw(context);

let Update = function(){
requestAnimationFrame(Update);
test.animate();
test0.animate();
}
Update();