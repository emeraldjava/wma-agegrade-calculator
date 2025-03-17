import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
// import { handleOperation, Operation } from "@wma-agegrade-calculator/wma-calculator-lib";
//type handleOperation = handleOperation

function App() {
  /* https://thriveread.com/create-monorepos-with-pnpm-workspaces/ */
  const [num1,setNum1] = useState(0);
  const [num2,setNum2] = useState(0);
  //const [result,setResult] = useState(0);

  //const submitOperation = (operation:Operation) => {
  //  setResult(handleOperation(num1,num2,operation));
  //}

  return (
    <>
      <div>
        <a href="https://vite.dev" target="_blank">
          <img src={viteLogo} className="logo" alt="Vite logo" />
        </a>
        <a href="https://react.dev" target="_blank">
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
      </div>
      <h1>Hi Vite + React</h1>
      <div className="card">
        <div>
          <p>The result is: {result}</p>
        </div>
        <form>
          <input type="number" name="num1" value={num1} onChange={e => setNum1(parseFloat(e.target.value))} />
          <input type="number" name="num2" value={num2} onChange={e => setNum2(parseFloat(e.target.value))} />
          {/* <button type='button' onClick={() => submitOperation(Operation.add)}>Addbutton</button>
          <button type='button' onClick={() => submitOperation(Operation.subtract)}>Subtractbutton</button>
          <button type='button' onClick={() => submitOperation(Operation.divide)}>Dividebutton</button>
          <button type='button' onClick={() => submitOperation(Operation.multiply)}>Multiplybutton</button> */}
        </form>
      </div>
    </>
  )
}

export default App
