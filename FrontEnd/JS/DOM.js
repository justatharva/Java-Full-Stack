// DOM Targeting Methods

let elements;

elements = document; // return html in document
elements = document.all[5]; // return all tags in document
elements = document.doctype; // returns document type
elements = document.documentElement; // returns elements in html document
elements = document.head; // returns head tag in html file
elements = document.title; // returns title of an html file
elements = document.body; // returns body tag in html file
elements = document.images; // returns images in html file
elements = document.anchors; // returns name inside anchor tag
elements = document.links; // returns all anchor tag in html file
elements = document.forms; // returns form tag inside html file
elements = document.URL; // returns link of an html file
elements = document.baseURI; // returns base link of an html file
elements = document.domain; // returns domain
// console.log(elements);

// How to target DOM Objects : 

let elements1 = document.getElementById("content");
let elements2 = document.getElementsByClassName("list")[0].innerText;
let elements3 = document.getElementById("header").getAttribute("class");
let elements4 = document.getElementById("header").getAttributeNode("class");
let elements5 = document.getElementById("header").attributes;
let elements6 = document.getElementsByTagName("h1");
console.log(elements6);

// How to set Targeting DOM Objects by HTML

// let elements7 = document.getElementById("header").innerHTML = "<h1>HyperTextMarkup Language</h1>";

// elements2 = document.getElementById("header").setAttribute("class","bac");
// elements2 = document.getElementsByTagName("h1").setAttribute("class","h1");

// How to change CSS by using DOM Objects

// let elements8 = document.getElementById("header").style.backgroundColor="pink";
// elements8 = document.getElementById("h1").style.color="red";
// console.log(elements8);

// Query Selector and Query Selector All

// let elements9 = document.querySelector("#header").innerHTML="<h1>Hello JS</h1>";

// let elements10 = document.querySelector("#header").getAttribute("class");
// console.log(elements10);

// element10 = document.querySelector("#header").setAttribute("class","xyz");
// console.log(elements10);

// elements10 = document.querySelectorAll(".list")[0].innerText;
// console.log(elements10);

// elements10 = document.querySelector("#content h2").innerText;
// console.log(elements10);


// How to get or set CSS Style methods

elements10 = document.querySelector("#header").style.border;
console.log(elements10)
elements10 = document.querySelector("#header").className="bca";
console.log(elements10)
elements10 = document.querySelector("#header").style.color;
console.log(elements10)

function abc(){
    let element11 = document.getElementById("header").style.backgroundColor="pink";
    element11.style.backgroundColor = "pink"
}


// Add Event Listener

// elements10 = document.getElementById("header").onclick="abc"