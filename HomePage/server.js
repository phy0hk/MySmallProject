const http = require('node:http');
const fs = require('fs');
const hostname =  "192.168.182.1";
// const Mongoose = require("mongoose");
const mongodb = require("mongodb").MongoClient;
const assert = require("assert");
const uri = "mongodb+srv://client:1234567890@test.fhbbggo.mongodb.net/";
const port = 3000;

const client = new mongodb(uri);
client.connect(function(err){
    assert.equal(null,err);
    console.log("Connected successfully!!")
})

const db_products = client.db('products');
const db_user = client.db('users');
// console.log(db.products.find());
client.close();

const server = http.createServer((req,res)=>{
    const url = req.url;
    console.log(url);
    if(url=="/"){
        fs.readFile("./index.html",'utf-8',(err,data)=>{
            if(err) throw err;
            else{
                res.writeHead(200,{"Content-Type":"text/html"})
                res.write(data);
                res.end();
            }
        });
    }
    if(url=="/app.js"){
        fs.readFile("./app.js",'utf-8',(err,data)=>{
            if(err) throw err;
            else{
                res.writeHead(200,{"Content-Type":"text/javascript"})
                res.write(data);
                res.end();
            }
        });
    }
    if(url=="/style.css"){
        fs.readFile("./style.css",'utf-8',(err,data)=>{
            if(err) throw err;
            else{
                res.writeHead(200,{"Content-Type":"text/css"})
                res.write(data);
                res.end();
            }
        });
    }
    if(url=="/favicon.ico"){
        fs.readFile("./gg.ico",(err,data)=>{
            if(err) throw err;
            else{
                res.writeHead(200,{"Content-Type":"ico"})
                res.write(data);
                res.end();
            }
        });
    }
});

server.listen(port,hostname,()=>{
    console.log(`Server is listen to http://${hostname}:${port}`);
   
});