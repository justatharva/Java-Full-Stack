import React from 'react'

export default function Functions() {

    const name = "John Kumar";
    const name1 = "React";
    const getName = (yourName)=>{
        return yourName;
    }

    function handleClick(){
        alert("Button Was Clicked");
    }

    function changeInput(e){
        console.log("Value is : "+e.target.value);
    }

  return (
    <div>
        <h1>Hello {getName()}</h1>
        <h1>by {getName(name)}</h1>
        <h1>Welcome {getName(name1)}</h1>

        <button onClick={handleClick}>Click ME</button>
        <button onClick={()=> alert("Hello Everyone")}>Say Hello</button>
        <input type="text" onChange={changeInput} placeholder='Enter something'/>
    </div>
  )
}
