import React from 'react'
import img from './assets/hero.png'
export default function Components() {
    function Greetings(){
        const name = "React"        /* Normal Function */
        return name;
    }
    const Greetings2 = ()=>{
        const name2 = "React"       /* Arrow Function */
        return name2;
    }
  return (
    <div>
        <h1>Welcome to {Greetings()}</h1>   {/*It calls the Greetings function and function returns the value */}
        <h1>Welcome to {Greetings2()}</h1>   {/*It calls the Greetings arrow function and function returns the value */}
        <h1>This is Components</h1>
        <img src={img} width='200' height='200'/>
    </div>
  )
}
