let uname = document.getElementById('uname');
let password = document.getElementById('pwd').value;
let confirmPwd = document.getElementById('confirmpwd').value;
let matchPwd = document.getElementById('matchPwd');

function checkPwd(){

    let pwd1 = sha256(password.value);

    let pwd2 =  sha256(confirmPwd.value);

    console.log(pwd1.value());
    console.log(pwd2);
if(pwd1 === pwd2){
    matchPwd.innerHTML = "Password match";
}else{
    matchPwd.innerHTML = pwd1;
}
}