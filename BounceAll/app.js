const canvas = document.getElementById("canvas");
const context = canvas.getContext("2d");

const canvas_height = 600;
const canvas_width = 600;

canvas.width = canvas_width;
canvas.height = canvas_height;

class Ball {
  constructor(x, y, r, s) {
    this.x = x;
    this.y = y;
    this.r = r;
    this.sx = s * (Math.random(1) - 1 * -1);
    this.sy = s * (Math.random(1) - 1 * -1);
  }
  bounce(context) {
    this.x += this.sx;
    this.y += this.sy;
    context.beginPath();
    context.arc(this.x, this.y, this.r, 0, 2 * Math.PI);
    context.fill();
    context.stroke();
    if (this.x + this.r >= canvas_width || this.x - this.r <= 0) {
      this.sx *= -1;
    } else if (this.y + this.r >= canvas_height || this.y - this.r <= 0) {
      this.sy *= -1;
    }
  }
}

let Ball0 = new Ball(canvas_width / 2, canvas_height / 2, 10, 5);

const Update = function () {
  requestAnimationFrame(Update);
  context.clearRect(0, 0, canvas_width, canvas_height);
  Ball0.bounce(context);
};
Update();
