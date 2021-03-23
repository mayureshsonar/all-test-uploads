import React from 'react';
import { useState, useEffect } from "react";
import {useParams} from "react-router-dom";
import {Customer} from './Customer';

  
export  function Customerupdate(props) {
    
  
    const [customer,updateCustomer]=useState({});
 
  const {id} = useParams()
    useEffect(()=> {
        fetch  ("http://localhost:8080/Hiber_curd/crud/update/"+id )
        .then(res => res.json())
        .then( () =>  { setCustomer(customer.map(customer=>customer.id ===id ? updateCustomer : customer));   }
        );
    },[customer,id]);

    const setCustomer =(event) =>{}
    const handleInputChange = (event) => {
        const { id, value } = event.target
        
        setCustomer({ ...customer, [id]: value })
      }



      
    
        return (
            <div>
              <Customer/>
              <form
      onSubmit={(event) => {
        event.preventDefault()

        this.updateCustomer(customer.id)
      }}
    >
      <label>Name</label>
      <input
        type="text"
        name="name"
        value={customer.name}
        onChange={handleInputChange}
      />
      <label>Mobile</label>
      <input
        type="text"
        name="Mobile"
        value={customer.mobile}
        onChange={handleInputChange}
      />
            <label>Address</label>
      <input
        type="text"
        name="Address"
        value={customer.address}
        onChange={handleInputChange}
      />
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

