import React from 'react'

export default function Student(props) {
    const {name,age,city,hobbies} = props
  return (
    <div>
        <h1>Hello React</h1>
        <p>Name is : {props.name}</p>
        <p>Age is : {props.age}</p>
        <p>City is : {props.city}</p>

        <ul>
            {
                hobbies.map((hobby,index)=>(
                    <li key={index}>{hobbies}</li>
                ))
            }
        </ul>
    </div>
  )
}
