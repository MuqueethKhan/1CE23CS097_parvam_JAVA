import React from 'react'
export default function Emps(props) {
    console.log(props.name);
    console.log(props.job);
    const styles={
        border:"2px solid white",
        margin:"30px",
    };
    return (
        <>
    <div style={styles}>
        This is Employee data:::::  NAME: {props.name}- JOB: {props.job}</div>
    <h5 style={{border:"2px solid white"}}>End of emp data</h5>
        </>
    )
}
