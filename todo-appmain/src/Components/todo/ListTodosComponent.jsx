import { useEffect, useState } from "react";
import { deleteTodoApi, retrieveAllTodosForUsernameApi } from "./api/TodoApiService";
import { useAuth} from "./security/AuthContext";

export default function ListTodosComponent() {
     const authContext = useAuth()
     const username = authContext.username
    const today = new Date();
    const targetDate = new Date(
      today.getFullYear() + 12,
      today.getMonth(),
      today.getDay()
    );

    const [todos, setTodos] = useState([])
    const [message,setMessage] = useState(null)
    // const todos = [
    //   { id: 1, description: "Learn AWS", done: false, targetDate: targetDate },
    //   {
    //     id: 2,
    //     description: "Learn Full stack dev",
    //     done: false,
    //     targetDate: targetDate,
    //   },
    //   {
    //     id: 3,
    //     description: "Learn React and spring boot",
    //     done: false,
    //     targetDate: targetDate,
    //   },
    // ];
          useEffect( () =>refreshTodos(),[] )

    function refreshTodos(){
    retrieveAllTodosForUsernameApi(username)
    .then((response)=>{
      console.log(response.data)
      setTodos(response.data)
    }
    )
    .catch(error =>console.log(error))
    }
   
    function deleteTodo(id){
      console.log('clicked' + id) ;
      deleteTodoApi(username, id)
      .then(
         //1 .Display Message
         //2. Update Todos list
         () => {setMessage(`Delete of todo with ${id} successful`)
         refreshTodos()
      }
      )
      .catch(
        error=>console.log(error)
      )
    }

    return (
      <div className="container">
        <h2>Things you want to do</h2>
        {message&& <div className="alert alert-warning">{message}</div> }
  
        <div>
          <table className="table">
            <thead>
              <tr>
                {/* <td>ID</td> */}
                <th>Description</th>
                <th>Done?</th>
                <th>Target Date</th>
                <th>Delete</th>
              </tr>
            </thead>
  
            <tbody>
              {todos.map((todo) => (
                <tr key={todo.id}>
                  {/* <td>{todo.id}</td> */}
                  <td>{todo.description}</td>
                  {/* <td>{todo.done}</td> */}
                  <td>{todo.done.toString()}</td>
                  <td>{todo.targetDate.toString()}</td>
                  <td><button className="btn btn-warning" onClick={()=>deleteTodo(todo.id)}>Delete</button></td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      </div>
    );
  }
  