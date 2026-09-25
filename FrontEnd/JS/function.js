function show(name){
    document.write("Good Morning "+ name +"<br>");
}
show("Rahul");
show("Atharva");
show("Rushi");
show("Varad");

// Function with return type

function fullname(fname = "John", lname = "Kumar"){
    var fullname = fname+ " : "+lname;
    return fullname;
}
var fullname = fullname("Ram", "Singh");
document.write(fullname)

function sum(math, bio, phy, chem){
    let sum = math + bio + phy + chem;
    return sum;
}

document.write("<br>Total of Subjects Marks : "+sum(75,85,95,55));