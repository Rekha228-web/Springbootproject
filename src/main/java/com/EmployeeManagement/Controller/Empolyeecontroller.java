package com.EmployeeManagement.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeManagement.Repository.EmpolyeeRepo;
import com.EmployeeManagement.model.Empolyee;
import com.EmployeeManagement.serviceIMPL.EmpolyeeserviceIMPL;

@RestController
@RequestMapping("/emp")
public class Empolyeecontroller {
	
	private EmpolyeeRepo repo;
	 
	@Autowired
	private EmpolyeeserviceIMPL empservice;
	
	@GetMapping("/home")
	public String homePage() {
		
		return "Welcome to Empolyee Management";
	}
	@PostMapping("/addEmp")
      public ResponseEntity<Empolyee> addEmpolyee(@RequestBody Empolyee empolyee) {
    	  
    	  Empolyee emp=empservice.addEmpolyee(empolyee);
    	  
    	  return new ResponseEntity<Empolyee>(emp,HttpStatus.CREATED);
      }
	
	 @DeleteMapping("/removeEmp")
	   public ResponseEntity<String> removeEmployee(@PathVariable int id) {
		  
		   empservice.removeEmpolyee(id);
		   
		   return new ResponseEntity<String>("Remove successfully",HttpStatus.ACCEPTED);
		   	
	}

	 @GetMapping("/findEmp")
	 public ResponseEntity<Optional<Empolyee>> findEmpolyeeById(@PathVariable int id){
		 
		 Optional<Empolyee> emps=empservice.findEmpById(id);
		 
		  return new ResponseEntity<Optional<Empolyee>>(emps,HttpStatus.ACCEPTED);
		    
	 }
	  
	 @GetMapping("/all")
	 public ResponseEntity<List<Empolyee>> listofEmpolyee(){
		 
		 List<Empolyee>lEmp=empservice.getAllEmpolyee();
		 
		return new ResponseEntity<List<Empolyee>>(lEmp, HttpStatus.ACCEPTED);
		
		 
	 }
	  
}
