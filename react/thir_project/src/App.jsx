import "./App.css";
import {CharLength}  from "./Components/CharLength";
import { Counter } from "./Components/Counter";

function App(){
  return (
    <>
    <h1>Use state hook!</h1>
    <Counter />
    <CharLength />
    </>
  );
}

export default App;