const express = require('express');
const http = require('http');
const app = express();
const fs = require('fs');
const sha256 = require('js-sha256');

app.get('/',(req,res)=>{
    console.log(sha256("GG"));
    fs.readFile('index.html','utf-8',(err,data)=>{
        if(err) throw err;
        else{
            res.send(data);
        }
    })
});

app.listen(3000,()=>{
    console.log('Server listen to port 3000')
});