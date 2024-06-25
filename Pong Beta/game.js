const canvas = document.getElementById("canvas")
const context = canvas.getContext('2d')

const canvas_width = 800
const canvas_height = 800

canvas.height = canvas_height
canvas.width = canvas_width
let score = 0

class Player {
    constructor(x,y,width,height,speed,color){
        this.x = x
        this.y = y
        this.width = width 
        this.height = height
        this.color = color
        this.speed = speed
    }
    animate(context){
        context.fillStyle = this.color
        context.fillRect(this.x,this.y,this.width,this.height)
    }
}
class Ball{
    constructor(x,y,radius,speed,color){
        this.x = x
        this.y = y
        this.radius =radius
        this.xs = speed
        this.ys = speed
        this.color = color
    }
    animate(context){
        context.beginPath()
        context.fillStyle = this.color
        context.strokeStyle = this.color
        context.arc(this.x,this.y,this.radius,0,2*Math.PI)
        context.fill()
        context.stroke()
        this.x += this.xs
        this.y += this.ys
        if(this.x+this.radius >= canvas_width || this.x-this.radius <=0){
            this.xs *= -1
        }
        if(this.y+this.radius >= canvas_height || this.y-this.radius <=0){
            this.ys *= -1
        }
    }
    itHitX(){
        this.xs *= -1
    }
    itHitY(){
        this.ys *= -1
    }
}
let PongPlayer = new Player(200,100,25,200,5,"black")
let PongBall = new Ball(500,500,15,10,"red")
let Update = function(){
    requestAnimationFrame(Update)
    context.clearRect(0,0,canvas_width,canvas_height)
    context.font = "30px serif"
    context.fillStyle = 'black'
    context.fillText(score,10,40)
    PongPlayer.animate(context)
    PongBall.animate(context)
    if(PongPlayer.x-10 <= PongBall.x+PongBall.radius && PongPlayer.x+PongPlayer.width+10 >= PongBall.x-PongBall.radius && PongPlayer.y+PongPlayer.height >= PongBall.y-PongBall.radius && PongPlayer.y <= PongBall.y+PongBall.radius){
        PongBall.itHitX()
        score += 1
    }
    if(PongPlayer.y-10 <= PongBall.y+PongBall.radius && PongPlayer.y+PongPlayer.height+10 >= PongBall.y-PongBall.radius && PongPlayer.x+PongPlayer.width >= PongBall.x-PongBall.radius && PongPlayer.x <= PongBall.x+PongBall.radius){
        PongBall.itHitY()
        score += 1
    }
}   
addEventListener("keydown",(event) =>{
    if(event.keyCode == 38){
        PongPlayer.y -= 40
    }else if(event.keyCode == 40){
        PongPlayer.y += 40
    }
})
Update()