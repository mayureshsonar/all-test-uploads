import React from 'react';
import {  BrowserRouter as Router, Switch,  Route,  Link} from "react-router-dom";
import Home from './Home';
 import Customerlist from './Customerlist';
 import {Customer} from './Customer';
 import {Customerdelete} from './Customerdelete';
 import {Customerupdate} from './Customerupdate';
 import {Customeradd} from './Customeradd';
 import Nomatch from './Nomatch';
class App extends React.Component {
   render() {
      return (
         <Router>
           <div>
             <nav>
               <ul>
                 <li>
                   <Link to="/">Home</Link>
                 </li>

                 <li>
                   <Link to="/Customerlist">Customerlist</Link>
                 </li>
               </ul>
             </nav>
     
             {/* A <Switch> looks through its children <Route>s and
                 renders the first one that matches the current URL. */}
             <Switch>
             <Route  exact path="/">
                 <Home/>
                 </Route> 

               <Route path="/Customerlist">
                 <Customerlist/>
               </Route> 
               <Route path="/Customer/:id">
               <Customer/>
               
               </Route>
               <Route path="/Customerdelete/:id">
                <Customerdelete/>
               </Route>
               
               <Route path="/Customerupdate/:id">
                <Customerupdate/>
               </Route>

               <Route path="/Customeradd">
                <Customeradd/>
               </Route>
               
                              
                        <Route path="*">
            <Nomatch/>
          </Route>
          </Switch>
           </div>
         </Router>
       );
        
   }
}
export default App
