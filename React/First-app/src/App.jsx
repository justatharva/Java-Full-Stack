import { useState } from 'react'
import heroImg from './assets/hero.png'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import StyleEx from './StyleEx'
import './App.css'
import Functions from './Functions'
import Student from './props/Student'
import Button from './props/Button'

function App() {
  const [count, setCount] = useState(0)

  const hobbies = ["Reading","Writing","Swimming"]

  function msg(){
    alert("This is message from message box")
  }

  function byMsg(){
    alert("Message from by MSG")
  }

  return (
    <>
      {/* <h1>Hello Atharva</h1> */}
      {/* <StyleEx/> */}
      {/* <Functions/> */}
      {/* <Student name='Karan' age = '23' city='Dhule'hobbies={hobbies}/> */}
      {/* <Student name='Atharva' age = '25' city='Baramati'/>
      <Student name='Rushi' age = '22' city='Pune'/>
      <Student/> */}

      <Button label="Click ME" handelClick={msg}/>
      <Button label="Bye Bye" handelClick={byMsg}/>

    </>
  )
}

export default App
