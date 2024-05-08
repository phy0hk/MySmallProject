// // const { response } = require("express");

// const InputData = document.getElementById('input');
// const OutputData = document.getElementById('output');
// function HashReq(){
//     console.log(InputData.value);
// }


const sha256 = require('sha256');
const Input = document.getElementById('input');
const Server = req('server');


function HashReq(){
    console.log(Input.value);
}