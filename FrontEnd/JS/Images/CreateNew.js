
let createNewElement = document.createElement("p");
let createNewText = document.createTextNode("This is text");

createNewElement.appendChild(createNewText);

document.getElementById("title").appendChild(createNewText);
let createNewComment = document.createComment("This is comment");
console.log(createNewElement);
console.log(createNewText);
console.log(createNewComment);