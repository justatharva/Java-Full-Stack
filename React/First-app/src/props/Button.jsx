import React from 'react'

export default function Button({label, handelClick}) {
  return (
    <div>
        <button onClick={handelClick}>{label}</button>
    </div>
  )
}
