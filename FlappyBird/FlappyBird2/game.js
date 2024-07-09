const canvas = document.getElementById("canvas");
const ctx = canvas.getContext("2d");
const canvas_width = (canvas.width = 550);
const canvas_height = (canvas.height = 800);
canvas.style.background = "White";
let momentum = 1;
let ObsArr = [];
let fail = false;
class Player {
  constructor(x, y, width, height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }
  falling() {
    this.fallVelocity = (9.8 * momentum) / 5;
  }
  animate(ctx) {
    ctx.fillStyle = "red";
    ctx.fillRect(this.x, this.y, this.width, this.height);
    this.falling();
    this.y += this.fallVelocity;
  }
  Jump(JumpDistance) {
    this.y -= JumpDistance;
    momentum = 1;
  }
}
setInterval(function () {
  momentum += 1;
}, 100);
function AddObs() {
  let ObsInfo = {
    x: canvas_width,
    y: 0,
    width: 80,
    height: Math.random() * (600 - 150) + 150,
    speed: -4,
  };
  ObsArr.push(ObsInfo);
}
setInterval(function () {
  AddObs();
}, 1500);
const Player1 = new Player(100, 450, 40, 40);
const Update = function () {
  if (fail) {
    console.log("GG");
    return;
  }
  ctx.clearRect(0, 0, canvas_width, canvas_height);
  requestAnimationFrame(Update);
  Player1.animate(ctx);
  for (let i = 1; i < ObsArr.length; i++) {
    let Obs = ObsArr[i];
    Obs.x += Obs.speed;
    ctx.fillStyle = "Black";
    ctx.fillRect(Obs.x, Obs.y, Obs.width, Obs.height);
    ctx.fillRect(
      Obs.x,
      Obs.height + 150,
      Obs.width,
      canvas_height - Obs.height - 150,
    );
    if (Obs.x == Player.x && Player.y < Obs.height) {
      fail = true;
    }
  }
};
addEventListener("keypress", function () {
  if ((Event.keycode = "35")) {
    Player1.Jump(65);
  }
});
Update();
