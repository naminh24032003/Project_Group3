import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.jsx'
import { BrowserRouter as Routes,Route } from 'react-router-dom'
import Signup from './component/page/Signup.jsx'


ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <App />
    <Routes>
      <Route path='/signup' component={Signup}></Route>
    </Routes>
  </React.StrictMode>,
)
