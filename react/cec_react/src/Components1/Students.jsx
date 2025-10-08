import React from 'react'
export default function Students(props) {
    console.log(props.sem)
    console.log(props.count);
    console.log(props.name);
    const styles={
        border:"2px solid white",
        margin:"10px",
    };
    return (
        <>
    <div style={styles}>
        This is students data::::   SEM: {props.sem}- ID: {props.count}- NAME: {props.name}</div>
    <h5 style={{border:"2px solid white", margin:"20px"}}>End of student data</h5>
    <hr></hr>
        </>
  )
}