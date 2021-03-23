
import React from 'react';
class Customerlist extends React.Component {
    
   render() {
        return (
           <div>
              <Customerall/>
           </div>
        ); 
       }
  }
  
  class Customerall extends React.Component {
    constructor(props) {
      super(props);
      
      this.state = {
        Customers: []
      };
    }
    componentDidMount() {
      fetch("http://localhost:8080/Hiber_curd/crud/Customers")
      .then(res => res.json())
      .then(
        (result) => {
          this.setState({
            Customers: result
          });
        }
      );
    }
    
    render() {
      return (

        <div>
         <a href={'/Customeradd/'}>Create New</a>
          <h2>Customers Data...</h2>
          <table>
            <thead>
              <tr>
                <th>Id: </th>
                <th>Name:</th>
                <th>Mobile: </th>
                <th>Address:</th>
                
              </tr>
            </thead>
            <tbody> 
            {this.state.Customers.map(customer => (
         <tr key={customer.id}>
         <td>{customer.id}</td>
        <td>{customer.name}</td>
        <td>{customer.mobile}</td>
        <td>{customer.address}</td>
        <td> <a href={'/Customerupdate/'+customer.id}>Edit</a></td>
       <td> <a href={'/Customer/'+customer.id}>Details</a></td>
       <td> <a href={'/Customerdelete/'+customer.id}>Delete</a></td>
        </tr>
                  ))}  
            </tbody>
          </table>
        </div>
        )
      }
  }
export default Customerlist;


