import logo from "./logo.svg";
import "./App.css";
import { Component } from "react";
import TodoApp from "./Components/todo/TodoApp";

function App() {
  return (
    <div className="App">
      <TodoApp></TodoApp>
    


    </div>
  );
}


// function PlayingWithProps(properties){
//   console.log(properties.property1);
//   console.log(properties.property2);

//   return (
//     <div>Props</div>
//   )
// }

// function PlayingWithProps({property1, property2}){
//   console.log(property1);
//   console.log(
//     property2);

//   return (
//     <div>Props</div>
//   )
// }



export default App;
