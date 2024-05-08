const { createServer } = require('node:http');
const fs = require("fs");
const hostname = 'localhost';
const port = 8080;

const server = createServer((req, res) => {
  const url = req.url;
  if(url==="/"){
    fs.readFile("../TicTacToe/index.html","utf-8",(err,data)=>{
      if(err) throw err;
      else{
        res.StatusCode = 200;
        res.setHeader("Content-Type","text/html");
        res.end(data);
      }
    });
  }else if(url==="/style.css"){
    fs.readFile("../TicTacToe/style.css","utf-8",(err,data)=>{
      if(err) throw err;
      else{
        res.StatusCode = 200;
        res.setHeader("Content-Type","text/css");
        res.end(data);
      }
    });
  }else if(url==="/tictactoe.js"){
    fs.readFile("../TicTacToe/tictactoe.js","utf-8",(err,data)=>{
      if(err) throw err;
      else{
        res.StatusCode = 200;
        res.setHeader("Content-Type","text/javascript");
        res.end(data);
      }
    });
  }
  
});

server.listen(port, hostname, () => {
  console.log(`Server running at http://${hostname}:${port}/`);
});
