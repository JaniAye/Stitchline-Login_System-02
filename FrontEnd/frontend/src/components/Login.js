import React, { useState } from 'react';
// import './Login.css';

import Form from "react-bootstrap/Form";
import Button from "react-bootstrap/Button";
import { fireEvent } from '@testing-library/react';

 function Login({Login,error}) {

    const [details,setDetails]=useState({userName:"", password:""});
    const submitHandler = e =>{
        e.preventDefault();

        Login(details);
    }
    return (
       <form onSubmit={submitHandler}>
          <div className="form-inner">
              <h2>Login Form</h2>
              {(error !="" ) ? (<div className="error">{error}</div>):"" }
              <div className="form-group">
                  <label className="labelc" htmlFor="userName">User Name : </label>
                  <input className="txtInputs" type="text" name="userName" id="username" onChange={e => setDetails({...details,userName:e.target.value})} value={details.userName}/>
              </div>

              <div className="form-group">
                  <label  className="labelc"  htmlFor="password">Password : </label>
                  <input className="txtInputs" type="password" name="password" id="password" onChange={e => setDetails({...details,password:e.target.value})} value={details.password}/>
              </div>
              <input type="submit" value="Login"/>
          </div>
       </form>
    )
}
export default Login;