import React from 'react';
import { useState, useEffect } from "react";
import {useParams} from "react-router-dom";


  
export  function Customeradd(props) {
    
  
    const [customer,addCustomer]=useState({});
 
  const {id} = useParams()
    useEffect(()=> {
        fetch  ("http://localhost:8080/Hiber_curd/crud/add/"+ id )
        .then(res => res.json())
        .then( () =>  { setCustomer(customer.map(customer=>customer.id ===id ? addCustomer : customer));   }
        );
    },[customer,id]);

    const setCustomer =(event) =>{}
    const handleInputChange = (event) => {
        const { id, value } = event.target
        
        setCustomer({ ...customer, [id]: value })
      }



      
    
        return (
            <div>
             
              <form
      onSubmit={(event) => {
        event.preventDefault()

        this.addCustomer(customer.id)
      }}
    >
              <label>ID</label>
      <input
        type="text"
        name="id"
        value={customer.id}
        onChange={handleInputChange}
      />
      <br/>
      <label>Name</label>
      <input
        type="text"
        name="name"
        value={customer.name}
        onChange={handleInputChange}
      />
      <br/>
      <label>Mobile</label>
      <input
        type="text"
        name="Mobile"
        value={customer.mobile}
        onChange={handleInputChange}
      />
      <br/>
        <label>Address</label>
      <input
        type="text"
        name="Address"
        value={customer.address}
        onChange={handleInputChange}
      />
      <br/>
      <button>Update customer</button>
      <button
        onClick={() => props.setEditing(false)}
        className="button muted-button"
      >
        Cancel
      </button>
    </form>
            </div>
          );
  }

