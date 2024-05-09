const http = require('node:http');
const fs = require('fs');
const { log } = require('node:console');
const hostname = "localhost";
const port = 8080;
const path = require('path');
const Pages = ["../index.html","../Create_Account.html","../Login.html"];



const server = http.createServer((req,res)=>{
    const url = req.url;
    if(url==="/"){
        res.writeHead(200,{"Content-Type":"text/html"});
        res.write('index.html');
        res.end();
    }
});

server.listen(port,()=>{
    console.log(`Server Listen to https://localhost:${port}/`);
});

