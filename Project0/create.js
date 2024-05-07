const { createServer } = require('node:http');
const fs = require('fs');
const port = 8080;
const pages = ['/index.html','/create.html','login.html'];

const server = createServer((req,res)=>{
    res.statuscode = 200;
    res.setHeader('Content-Type','text/html');
    res.end("gg");
});
server.listen(port,()=>{
    console.log('Server Running at ${port}');
});