//var
//Redeclare and reassign

var a = "Hello Variable";
var a = "Hello JS";
a = 30;
document.write(a);

//let
// only reassign not redeclare
let b = "<br>Hello new variable"
b = "<br>"+20
document.write(b)

//const
// both redeclare and reassign not possible
const c = "<br>Hello Const Variable<br>"

document.write(c)

// Data Types

var str = ["Html", "Css", 23, 25 ,29, "Java", true];
document.write(str+"<br>"+typeof(str));

// Operators

var a = 20;
var b1 = 2;

document.write("Addition is : "+(a+b1)+"<br>");
document.write("Substraction is : "+(a-b1)+"<br>");
document.write("Multiplication is : "+(a*b1)+"<br>");
document.write("Division is : "+(a/b1)+"<br>");
document.write("Exponential is : "+(a**b1)+"<br>");
document.write("Modulus is : "+(a%b1)+"<br>");
document.write("Increment is : "+(a++)+"<br>");
document.write("Decrement is : "+(a--)+"<br>");
document.write("is a>b : "+(a>b)+"<br>");

// Conditionals Statement

var age = prompt("Enter Age : ")

if(age>18){
    alert("Congratulations...🥳You are Eligible")
    
}else{
    alert("You are not Eligible.❌ Your age is "+age)
}

// Loops

// for(i=1;i<=10;i++){
//     document.write("<br>"+i)
// }

// var num = 20;
// do{
//     document.write("<br>"+num)
//     num--;
// }while(num>0);
