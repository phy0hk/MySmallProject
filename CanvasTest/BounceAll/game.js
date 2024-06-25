const canvas = document.getElementById('canvas');
const context = canvas.getContext('2d');

 canvas_width = 600
 canvas_height = 600

canvas.width = canvas_width
canvas.height = canvas_height

class Box{
    constructor(x,y,r,s){
        this.x = x
        this.y = y
        this.r = r
        this.sx = s
        this.sy = s
    }
    Bounce(context){
        context.fillStyle = 'red'
        context.beginPath()
        context.arc(this.x,this.y,this.r,0,2*Math.PI)
        context.stroke()
        context.fill()
        this.x -= this.sx
        this.y -= this.sy - 1
        if(this.x+this.r >= canvas_width || this.x-this.r<=0){
            this.sx *= -1
        }
        if(this.y+this.r >= canvas_height){
            this.sy *= -1
            this.y = canvas_height - this.r
        }else if(this.y-this.r<=0){
            this.sy *= -1
            this.y = 0+this.r
        }
    }
}
let Box0 = new Box(100,200,10,10)
const Update = function(){
    requestAnimationFrame(Update)
    context.clearRect(0,0,canvas_width,canvas_height)
    Box0.Bounce(context)
}
Update()