import "./App.css";
import Students from "./Components1/Students";
import Emps from "./Components1/Emps";

function App(){
    return(
        <>
        <h1>Data drawn from student and employee</h1>
        <Students sem={3} count={25} name={"Manish"} />
        <Emps name={"Mohit"} job={"Manager"} />
        </>
    );
}

export default App;
