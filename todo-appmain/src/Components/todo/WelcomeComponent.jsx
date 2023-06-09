import {BrowserRouter, Routes, Route, useNavigate, Navigate, useParams, Link} from "react-router-dom";
import { useState } from "react";
import {retrieveHelloWorldBean, retrieveHelloWorldPathVariable} from './api/HelloWorldApiService'



export default function WelcomeComponent() {
    const { username1 } = useParams();
    const [message, setMessage]= useState(null);

    function callHelloWorldRestApi(){
      console.log('called');


      // axios.get('http://localhost:8080/hello-world')
      // .then((response)=>successfulResponse(response))
      // .catch((error)=> errorResponse(error))
      // .finally(()=>console.log('CleanUP'))

      retrieveHelloWorldBean()
      .then((response)=>successfulResponse(response))
      .catch((error)=> errorResponse(error))
      .finally(()=>console.log('CleanUP'))

    }

    //   retrieveHelloWorldPathVariable('ManishReact')
    //   .then((response)=>successfulResponse(response))
    //   .catch((error)=> errorResponse(error))
    //   .finally(()=>console.log('CleanUP'))
      
    // }

    function successfulResponse(response){
      console.log(response);
       setMessage(response.data.message);
    }

    function errorResponse(error){
      console.log(error);
    }




    return (
      <>
        <div className="welcome">Welcome {username1}</div>
        <div>
          Manage Your Todos here:- <Link to="/todos">Go Here...</Link>
        </div>

        <div>
          <button className="btn btn-success m-5" onClick={callHelloWorldRestApi}>Call Hello World REST API</button>
        </div>
        <div className="text-info">{message}</div> 
      </>
    );
  }
  