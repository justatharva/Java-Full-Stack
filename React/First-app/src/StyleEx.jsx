import React from 'react'

export default function StyleEx() {
    const headingStyle = {
        backgroundColor: "pink",
        color : "Blue",
        fontSize: "20px",
        textAlign: "center",
        padding: "10px"
    }
  return (
    <div>
        <h1 style={{backgroundColor:"red", color:"blueviolet"}}>This is inline CSS</h1>
        <h1 style={headingStyle}>This is internal CSS</h1>
        <h3 className='demo'>This is External CSS</h3>
    </div>
  )
}
