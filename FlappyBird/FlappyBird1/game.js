const canvas = document.querySelector("canvas");
const context = canvas.getContext("2d");

const canvas_height = 600;
const canvas_width = 600;

canvas.width = canvas_width;
canvas.height = canvas_height;

let ObsArr = [];
let point = 0;
class GameObj{
    constructor(xpos,ypos,width,height,speed,color){
        this.xpos = xpos
        this.ypos = ypos
        this.width = width
        this.height = height
        this.speed = speed
        this.color = color
        this.gravity = 1
        this.push = 0
    }
    animate(ctx){
        ctx.clearRect(this.xpos,this.ypos,this.width,this.height)
        ctx.fillStyle = this.color
        ctx.fillRect(this.xpos,this.ypos,this.width,this.height)
            this.xpos += this.push
        if(this.ypos<=0){
            this.ypos = canvas_height-this.height
            this.gravity = 1
        }else{
            this.gravity *= 1.08
            this.ypos += this.gravity
        }
    }
    draw(ctx){
        ctx.fillStyle = this.color
        ctx.fillRect(this.xpos,this.ypos,this.width,this.height)
    }
   setSpeed(speed){
        this.speed = speed
    }
    setYpos(ypos){
        this.ypos = ypos
    }

}
const player = new GameObj(100,300,60,40,10,"red");
function MakeNewObs(){
let BoxInfo = {
    x : canvas_width,
    y : 0,
    h : Math.random()*300 + 100,
    s : -5
}
ObsArr.push(BoxInfo);
}
setInterval(() => {
    MakeNewObs();
}, 1000);

let Update = function(){
    requestAnimationFrame(Update)
        context.clearRect(0,0,canvas_width,canvas_height)
        for(let i = 0; i< ObsArr.length ; i++){
        let Obs = ObsArr[i];
        Obs.x += Obs.s
        context.fillStyle = "Black"
        context.fillRect(Obs.x,Obs.y,80,Obs.h)
        context.fillRect(Obs.x,Obs.h+130,80,canvas_height-Obs.h-100)
        if(player.xpos+player.width == Obs.x && player.ypos+player.height >= Obs.h+130 || player.xpos+player.width == Obs.x && player.ypos<=Obs.h){
            player.push = Obs.s
        }
        if(player.ypos+player.height==Obs.height+130){
            player.ypos = Obs.h+130;
        }
        if(player.xpos > Obs.x){
            point = i+1
        }
        if(player.ypos+player.height>canvas_height){
            return;
        }
    }
    context.fillStyle = "Green"
    context.font = "20px Arial"
    context.fillText(""+point,0,20)
     player.animate(context)
// context.clearRect(0,0,canvas_width,canvas_height)
}
addEventListener('keydown',(event)=>{
    if(event.keyCode ===32){
        if(player.ypos <=0){
        }else{
        player.ypos -= 60
        player.gravity = 1
        }
        
    }
})
Update();