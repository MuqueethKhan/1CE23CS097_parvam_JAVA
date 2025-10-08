import React from 'react'
export default function FirstComponent(props) {
    console.log(props.count);
    console.log(props.data);
    const styles={
        border:"2px solid white",
        margin:"10px",
    };
    return (
        <>
    <div style={styles}>
        This is first component  {props.count}-{props.data}</div>
    <h2 style={styles}>This is heading 2</h2>
        </>
  )
}
