import React from 'react';
import { useState, useEffect } from "react";
import {useParams} from "react-router-dom";
import {Customer} from './Customer';
import Customerlist from './Customerlist';
  
export  function Customerdelete() {

  const [customer,deleteCustomer]=useState({});
  const {id} = useParams()
    useEffect(()=> {
        fetch  ("http://localhost:8080/Hiber_curd/crud/delete/"+id , {method:"Delete"})
        .then(res => res.json())
        .then( () =>  { deleteCustomer(customer.filter(customer=>customer.id !==id));   }
        );
    },[customer,id]);
    



      
    
        return (
            <div>
              <Customer/>
                <h1>Confirm Delete..?</h1>
                <button onClick={'./Customerdelete'}> Confirm</button>
                <button href={<Customerlist/>}>Cancel</button>
            </div>
          );
  }

