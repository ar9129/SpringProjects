import { createContext, useContext, useState } from "react";

//Create a context
export const AuthContext= createContext();

export const useAuth = () => useContext(AuthContext);
//If any other class wants to make use of Authentication context, it can use 'UseAuth' hook



//Share the created context with other components
export default function AuthProvider({children}){


    //Put some state in context

     const[isAuthenticated, setAuthenticated] = useState(false);
     const[username,setUsername] = useState(null)
    //  setInterval(
    //     ()=>setNumber(number+1),
    //     10000
    //  )
      

    function login(Username, Password){
        if (Username === "aditya" && Password === "dummy") {
            setAuthenticated(true);
            setUsername(Username)
              return true;
          } else {
            setAuthenticated(false);
            setUsername(null)
            return false;
          }
    }

    function logout(){
          setAuthenticated(false);
    }

    return(
        <AuthContext.Provider value={{isAuthenticated, setAuthenticated, login, logout,username}}>
            {children}
        </AuthContext.Provider>
    )
}

