const output = document.getElementById("inputOrOutput");
document.getElementById("one").addEventListener("click", function () { NumClick() });
document.getElementById("two").addEventListener("click", function () { NumClick() });
document.getElementById("three").addEventListener("click", function () { NumClick() });
document.getElementById("four").addEventListener("click", function () { NumClick() });
document.getElementById("five").addEventListener("click", function () { NumClick() });
document.getElementById("six").addEventListener("click", function () { NumClick() });
document.getElementById("seven").addEventListener("click", function () { NumClick() });
document.getElementById("eight").addEventListener("click", function () { NumClick() });
document.getElementById("nine").addEventListener("click", function () { NumClick() });
document.getElementById("zero").addEventListener("click", function () { NumClick() });
document.getElementById("add").addEventListener("click", function () { NumClick() });
document.getElementById("sub").addEventListener("click", function () { NumClick() });
document.getElementById("divide").addEventListener("click", function () { NumClick() });
document.getElementById("multiply").addEventListener("click", function () { NumClick() });
document.getElementById("dot").addEventListener("click", function () { NumClick() });
document.getElementById("dzero").addEventListener("click", function () { NumClick() });
document.getElementById("modulus").addEventListener("click", function () { NumClick() });

var num1;
var num2;
var answer;
let currentCase;
function NumClick() {
    const currentBtn = event.target.id;
    if (output.value === "Enter a value!") {
        output.value = "";
    }
    if (answer === output.value) {
        output.value = "";
    }
    switch (currentBtn) {
        case "one":
            output.value = output.value + "1";
            break;
        case "two":
            output.value = output.value + "2";
            break;
        case "three":
            output.value = output.value + "3";
            break;
        case "four":
            output.value = output.value + "4";
            break;
        case "five":
            output.value = output.value + "5";
            break;
        case "six":
            output.value = output.value + "6";
            break;
        case "seven":
            output.value = output.value + "7";
            break;
        case "eight":
            output.value = output.value + "8";
            break;
        case "nine":
            output.value = output.value + "9";
            break;
        case "zero":
            output.value = output.value + "0";
            break;
        case "add":
            output.value = output.value + "+";
            break;
        case "sub":
            output.value = output.value + "-";
            break;
        case "divide":
            output.value = output.value + "/";
            break;
        case "multi":
            output.value = output.value + "*";
            break;
        case "dot":
            output.value = output.value + ".";
            break;
        case "dzero":
            output.value = output.value + "00";
            break;
        case "modulus":
            output.value = output.value + "%";
            break;
        default:
            output.value = "";
            break;
    }
}
function Clear() {
    output.value = "";
    num1 = undefined;
    num2 = undefined;
}
function del() {
    output.value = output.value.substr(0, output.value.length - 1);
}
function solve() {
    if (output.value.length <= 0) {

    } else {
        let x = output.value;
        let y = eval(x);
        output.value = y
    }
}