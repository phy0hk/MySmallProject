var gameArr = [
    [0,0,0],
    [0,0,0],
    [0,0,0]
]
var turn = 0;
var gameIsNotEnd = 0;
function bt0(){
    if(turn===0 && gameArr[0][0]===0){
 document.getElementById("bt0").innerHTML = "X";
 turn=1;
 gameArr[0][0] = 1;
    }else if(turn===1 && gameArr[0][0]===0){
        document.getElementById("bt0").innerHTML = "O"; 
        turn=0;
gameArr[0][0] = 2;
    }
    gameChecker();
}
function bt1(){
    if(turn===0 && gameArr[0][1]===0){
        document.getElementById("bt1").innerHTML = "X";
        turn=1;
        gameArr[0][1] = 1;
           }else if(turn===1 && gameArr[0][1]===0){
               document.getElementById("bt1").innerHTML = "O"; 
               turn=0;
       gameArr[0][1] = 2;
           }
       console.log(gameArr);
       gameChecker();
}
function bt2(){
    if(turn===0 && gameArr[0][2]===0){
        document.getElementById("bt2").innerHTML = "X";
        turn=1;
        gameArr[0][2] = 1;
           }else if(turn===1 && gameArr[0][2]===0){
               document.getElementById("bt2").innerHTML = "O"; 
               turn=0;
       gameArr[0][2] = 2;
           }
       console.log(gameArr);
       gameChecker();
}
function bt3(){
    if(turn===0 && gameArr[1][0]===0){
        document.getElementById("bt3").innerHTML = "X";
        turn=1;
        gameArr[1][0] = 1;
           }else if(turn===1 && gameArr[0][0]===0){
               document.getElementById("bt3").innerHTML = "O"; 
               turn=0;
       gameArr[1][0] = 2;
           }
       console.log(gameArr);
       gameChecker();
}
function bt4(){
    if(turn===0 && gameArr[1][1]===0){
        document.getElementById("bt4").innerHTML = "X";
        turn=1;
        gameArr[1][1] = 1;
           }else if(turn===1 && gameArr[1][1]===0){
               document.getElementById("bt4").innerHTML = "O"; 
               turn=0;
       gameArr[1][1] = 2;
           }
       console.log(gameArr);
       gameChecker();
}
function bt5(){
    if(turn===0 && gameArr[1][2]===0){
        document.getElementById("bt5").innerHTML = "X";
        turn=1;
        gameArr[1][2] = 1;
           }else if(turn===1 && gameArr[1][2]===0){
               document.getElementById("bt5").innerHTML = "O"; 
               turn=0;
       gameArr[1][2] = 2;
           }
       console.log(gameArr);
       gameChecker();
}
function bt6(){
    if(turn===0 && gameArr[2][0]===0){
        document.getElementById("bt6").innerHTML = "X";
        turn=1;
        gameArr[2][0] = 1;
           }else if(turn===1 && gameArr[2][0]===0){
               document.getElementById("bt6").innerHTML = "O"; 
               turn=0;
       gameArr[2][0] = 2;
           }
       console.log(gameArr);
       gameChecker();
}
function bt7(){
    if(turn===0 && gameArr[2][1]===0){
        document.getElementById("bt7").innerHTML = "X";
        turn=1;
        gameArr[2][1] = 1;
           }else if(turn===1 && gameArr[2][1]===0){
               document.getElementById("bt7").innerHTML = "O"; 
               turn=0;
       gameArr[2][1] = 2;
           }
       console.log(gameArr);
       gameChecker();
}
function bt8(){
    if(turn===0 && gameArr[2][2]===0){
        document.getElementById("bt8").innerHTML = "X";
        turn=1;
        gameArr[2][2] = 1;
           }else if(turn===1 && gameArr[2][2]===0){
               document.getElementById("bt8").innerHTML = "O"; 
               turn=0;
       gameArr[2][2] = 2;
           }
       console.log(gameArr);
       gameChecker();
}
function gameChecker(){
    if(gameArr[0][0]==1 && gameArr[0][1]==1 && gameArr[0][2]){
   window.alert("X Win.");
}else if(gameArr[1][0]==1 && gameArr[1][1]==1 && gameArr[1][2]==1){
    window.alert("X Win.");
}else if(gameArr[2][0]==1 && gameArr[2][1]==1 && gameArr[2][2]==1){
    window.alert("X Win.");
}else if(gameArr[0][0]==1 && gameArr[1][0]==1 && gameArr[2][0]==1){
    window.alert("X Win.");
}else if(gameArr[0][1]==1 && gameArr[1][1]==1 && gameArr[2][1]==1){
    window.alert("X Win.");
}
}
