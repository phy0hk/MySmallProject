const canvas = document.getElementById('canvas');
const context = canvas.getContext('2d');

const canvas_width = 1000;
const canvas_height = 600;

canvas.width = canvas_width;
canvas.height = canvas_height;

class Player{
    constructor(xpos,ypos,width,height){
        this.xpos = xpos
        this.ypos = ypos
        this.width = width
        this.height = height
        this.speed = 5
    }
    animate(context){
        context.fillStyle = "red"
        context.fillRect(this.xpos,this.ypos,this.width,this.height)
        if(this.ypos+this.height >= canvas_height){
            this.ypos = canvas_height-this.height
        }else{
            this.ypos += this.speed;
        }
    }
    setXpos(xpos){
        this.xpos = xpos
    }
    setYpos(ypos){
        this.ypos = ypos
    }
}

const Player0 = new Player(100,100,100,100)

const Update = function(){
    requestAnimationFrame(Update)
    context.clearRect(0,0,canvas_width,canvas_height);
    Player0.animate(context);

}
addEventListener('keydown',(event)=>{
    if(event.keyCode === 37){
        Player0.setXpos(Player0.xpos-50)
    }
    else if(event.keyCode === 38 || event.keyCode===32){
        Player0.setYpos(Player0.ypos-100)
    }
    else if(event.keyCode === 39){
        Player0.setXpos(Player0.xpos+50)
    }
})
Update();