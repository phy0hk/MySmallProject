const canvas = document.getElementById("canvas")
const ctx = canvas.getContext("2d")
canvas.width = 800
canvas.height = 800

class Obj{
    constructor(x,y){
        this.x = x
        this.y = y
        this.r = 50
        this.s = 1
    }
    draw(ctx){
        ctx.fillStyle = "black"
        ctx.beginPath()
        ctx.arc(this.x,this.y,this.r,0,2*Math.PI)
        // ctx.stroke()
        ctx.fill()
        this.s *= 1.1
        this.y += this.s
    }
    bounce(){
        this.s = (this.s/1.29)*-1
    }
    down(){
        this.s = 1
    }
}

let box = new Obj(350,55)
let highest = box.y
let Update = function(){
    requestAnimationFrame(Update)
    ctx.clearRect(0,0,canvas.width,canvas.height)
    if (box.y>canvas.height-50) {
        box.bounce()
    }
    box.draw(ctx)
    if(box.y<=highest && highest>0 && box.s <0){
        highest +=120
        console.log("GG");
        box.down()
    }else if(highest>ctx.height-155){
        return
    }
}
Update()