const username = document.getElementById("Username");
const email = document.getElementById("Email");
const passwd = document.getElementById("password");
const cpasswd = document.getElementById("confirm_password");
console.log("GG");
function pwd() {
    console.log(passwd.value.length);
    if (passwd.value.length < 8) {
        document.getElementById("pwderr").style.display = "contents";
    } else {
        document.getElementById("pwderr").style.display = "none";
    }
    if (passwd.value !== cpasswd.value || cpasswd.value.length<7) {
        document.getElementById("cpwderr").style.display = "contents";
    }else {
        document.getElementById("cpwderr").style.display = "none";
    }
}
function signup() {
    if (email.value.length == 0) {
        document.getElementById("emailerr").style.display = "contents";
    } else {
        document.getElementById("emailerr").style.display = "none";
    }
    if (username.value.length == 0) {
        document.getElementById("unameerr").style.display = "contents";
    } else {
        document.getElementById("unameerr").style.display = "none";
    }
    pwd();
}


