const canvas = document.getElementById("canvas")
const ctx = canvas.getContext("2d")
canvas_width = 800
canvas_height = 800

canvas.width = canvas_width
canvas.height = canvas_height

class Box{
    constructor(x,y,w,h,s){
        this.x = x
        this.y = y
        this.w = w
        this.h = h
        this.s = s*1
    }
    draw(ctx){
        ctx.fillStyle = "Black"
        ctx.fillRect(this.x,this.y,this.w,this.h)
    }
    animate(){
        ctx.clearRect(this.x,this.y,this.w,this.h)
        this.draw(ctx)
        this.x -= this.s
        this.y = this.y;
        // this.animater()
    }
    setSpeed(s){
        this.s = s
    }
}
let Box0 = new Box(100,100,100,100,20)
let Update = function(){
    requestAnimationFrame(Update)
    ctx.clearRect(0,0,canvas_width,canvas_height)
    Box0.draw(ctx);
    Box0.animate();
    console.log(Box0.x);
    if(Box0.x <= 0 || Box0.x+Box0.w >= canvas_width){
        Box0.setSpeed(Box0.s*-1)
    }
}
Update();