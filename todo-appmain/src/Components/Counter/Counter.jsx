import { useState } from "react"
import "./Counter.css"
import CounterButton from './CounterButton'

export default function Counter() {


  const [count, setCount] = useState(0);

  function incrementCounterParentFunction(by) {
    setCount(count + by);
    console.log(count);
  }

  function decrementCounterParentFunction(by) {
    setCount(count - by);
    console.log(count);
  }

  function ResetFunction(){
    setCount(0);
    console.log(count);
  }

  return (
    <div className="Counter">

      <p className="totalCount">{count}</p>

      <CounterButton by={1} incrementMethod= {incrementCounterParentFunction} decrementMethod= {decrementCounterParentFunction} />

      <CounterButton by={2} incrementMethod= {incrementCounterParentFunction} decrementMethod= {decrementCounterParentFunction} />

      <CounterButton by={5} incrementMethod= {incrementCounterParentFunction} decrementMethod= {decrementCounterParentFunction} />
      <div><button className="counterButton" onClick={ResetFunction}> RESET</button> </div>

    </div>
  );
}

