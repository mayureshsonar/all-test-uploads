import React from 'react';
import { useState, useEffect } from "react";
import {useParams} from "react-router-dom"
  
  export function Customer(props) {
      
    const [customer,setCustomer]=useState({});
    const {id} = useParams()
      useEffect(()=> {
          fetch("http://localhost:8080/Hiber_curd/crud/search/"+id )
          .then(res => res.json())
          
          .then( (result) => { setCustomer(result);   }
          );
      },[id]);
    
        return (
         <div><label>id:</label>
            {customer.id}<br/>
            <label>Name:</label>
            {customer.name}<br/>
            <label>Mobile:</label>
            {customer.mobile}<br/>
            <label>Address:</label>
            {customer.address}<br/>
            </div>
          );
  }
 
 
