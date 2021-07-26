import React, { useState } from 'react';
// import './App.css';
import LoginForm from './components/Login';
import Register from './components/Register';
import aa from './aa';

function App() {
  const adminUser={
    userName:"Janidu",
    password:"1234"
  }

  const [user, setUser]=useState({name:"",email:""});
   const [error, setError]=useState("");
    const Login=details=>{
      console.log(details);
      if  (details.userName==adminUser.userName && details.password==adminUser.password){
          console.log("Logged In");
          setUser({
            userName: details.name,
            password: details.password
          });
      }else{
        setError("Details do not match...");
      }
    }

    const Logout=()=>{
      setUser({name:"" ,email:""});
    }


  return (
    <div className="App">

          {(user.email != "") ? (
              <div className="welcome">
                <h2>welcome, <span>{user.name}</span></h2>
                <button onClick={Logout}>Logout</button>
              </div>
            ):(
                <LoginForm Login={Login} error={error}/>
            )    
           }
       
      
    </div>
   
  );
}

export default App;
