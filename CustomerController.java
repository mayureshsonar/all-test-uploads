package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
@CrossOrigin("http://localhost:3000")
public class CustomerController
{
	@Autowired
	CustomerManager manager;
	@GetMapping(value = "crud/Customers",headers = "Accept=application/json")  
	 public String showCustomers()
	 {
		  return new Gson().toJson(manager.getCustomers());
	 }
	@GetMapping(value = "crud/search/{pid}", headers = "Accept=application/json")  
	 public Customer getPro(@PathVariable int pid)
	 {
		Customer p=manager.getCustomer(pid);
		return p;
	 }
	@DeleteMapping(value = "crud/delete/{pid}", headers = "Accept=application/json")  
	 public void removepro(@PathVariable int pid)
	 {
		manager.delete(pid);
	 }
	@PutMapping(value = "crud/update/{pid}",headers = "Accept=application/json")  
	 public void updatepro(@RequestBody Customer customer,@PathVariable int pid)
	 {
		manager.update(customer,pid);
	 }
	@PostMapping(value = "crud/add", headers = "Accept=application/json")  
	 public void addpro(@RequestBody Customer customer)
	 {
		System.out.println("addpro called");
		manager.addCustomer(customer);
	 }
}
