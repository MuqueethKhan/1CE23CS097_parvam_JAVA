import "./App.css";
import FirstComponent from "./Components/FirstComponent";
import Mycomponent from "./Components/Mycomponent";

function App(){
    return(
        <>
        <h1>Hello World!</h1>
        <FirstComponent count={1000000000} data={"This is confidential"} />
        <Mycomponent />
        </>
    );
}

export default App;
