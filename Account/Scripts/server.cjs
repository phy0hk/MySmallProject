const { error } = require('console');
const http = require('http');
const fs = require('fs');
const path = require('path');

const server = http.createServer((req,res)=>{
    const filePath = path.join(__dirname,"../"+req.url);
    fs.readFile(filePath,(err,data)=>{
        if(err){
            throw err;
        }else{
            const contentType = getContentType(filePath);
            res.writeHead(200,{'Content-Type':'contType'});
            res.write(data);
            res.end();
        }
    });
});
server.listen(8080,()=>{
    console.log(`Server listen to http://localhost:8080`);
});
function getContentType(filePath){
    const extension = path.extname(filePath);
    switch(extension){
        case '.html':return 'text/html';
        case '.css':return 'text/css';
        case '.js':return 'text/javascript';
        default:return 'text/plain'
    }
}