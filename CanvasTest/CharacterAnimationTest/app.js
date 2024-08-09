const canvas = document.getElementById("canvas")
const ctx = canvas.getContext("2d")
canvas.width = 500
canvas.height = 500
let character = new Image();
character.src = 'Samurai/Walk.png'
let xpos =-200

// let Update = function(){
//     requestAnimationFrame(Update)
//     ctx.clearRect(0,0,canvas.width,canvas.height)
//     ctx.drawImage(character,xpos,0,128,128,50,100,400,400)
//     if(xpos==1024){
//         xpos=0
//     }else{
//         frame++
//     }
//     if(frame==5){
//         frame=0
//         xpos+=128
//     }
// }
let numsFrame = character.width/128
let currFrame = 0
function animate(){
    ctx.clearRect(0,0,canvas.width,canvas.height)
     ctx.drawImage(character,currFrame*128,0,128,128,xpos,100,400,400)
     currFrame++
     if(currFrame==numsFrame){
        currFrame=0
     }
     xpos+= 10
     if(xpos>canvas.width){
        xpos=-200
     }
}
// character.onload = function() {
//     setInterval(animate, 50);
// };
character.onload = function() {
    setInterval(animate, 100);
};
console.log(character.width);

