const canvas = document.getElementById('canvas');
const context = canvas.getContext('2d');

const canvas_width = 600;
const canvas_height = 600;

let Ground = [];
let BigGround = [];
for(let i=0;i<canvas_width;i++){
    for(let j=0;j<canvas_height;j++){
        BigGround[j] = [];
        BigGround[i][j] = 0
    }
}

canvas.width = canvas_width;
canvas.height = canvas_height;

function addSand(x,y){
    let grainOfSand = {
        x : x,
        y : y,
        width : 10,
        height : 10
    }
    Ground.push(grainOfSand);
}
function getMousePos(canvas,event){
    const rect = canvas.getBoundingClientRect();
    const x = event.clientX - rect.left;
    const y = event.clientY - rect.top;
    addSand(Math.round(x),Math.round(y));
}
const Update = function(){
    requestAnimationFrame(Update)
    context.clearRect(0,0,canvas_width,canvas_height);
    for(let i=0;i<Ground.length;i++){
        let sands = Ground[i];
        if(sands.y+sands.height>=canvas_height || BigGround[sands.x,sands.y-1]==1){
            BigGround[sands.x][sands.y] = 1
            sands.y = canvas_height-sands.height
        }else{
            sands.y += 4;
        }
        context.fillStyle = "black";
        context.fillRect(sands.x,sands.y,sands.width,sands.height)
        console.log(BigGround[sands.x][sands.y]);
    }
}

canvas.addEventListener('mousedown',function(e){
    getMousePos(canvas,e);
})

Update();