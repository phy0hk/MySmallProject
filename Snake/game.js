const canvas = document.getElementById('canvas')
const context = canvas.getContext("2d")

canvas.height = 800
canvas.width = 800

class SnakeObj{
    constructor(x){
        this.x = x
        this.y = y
        this.width = 20
        this.height = 20
    }
    move(context){
        context.fillStyle = 'black'
        context.fillRect(this.x,this.y,this.width,this.height)
    }
}

let Snake = new SnakeObj(canvas.width/2, canvas.hidth/2)
Snake.move()































context.fillStyle = 'gray'
context.fillRect(0,0,canvas.width,canvas.height)