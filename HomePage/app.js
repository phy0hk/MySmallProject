
const Container = document.getElementById('productsContainer');
let gg = "gg";


function addDiv(){
    var product = document.createElement("div");
product.innerHTML = `${gg}`;
product.classList.add("childcontainer");
Container.appendChild(product);
}



// function fetchJSONData(){
//     let data;
//     fetch("./testProduct.json").then((res)=>{
//         return res.json();
//     }).then((data)=>{
//         console.log(data);
//     });

// }
// fetchJSONData();

