let sha256 = require('js-sha256');

let user0pwd = "123456$abc";

let serverpwd = "bc3a18459af6a7c2821fb4178fcc35e6bd4a2466c4711291a8229557c2284968";

if(sha256(user0pwd)==serverpwd){
    console.log("Login Success")
}else{
    console.log("Login Failed");
}