package com.EmployeeManagement.serviceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.EmployeeManagement.Repository.EmpolyeeRepo;
import com.EmployeeManagement.model.Empolyee;
import com.EmployeeManagement.service.Empolyeeservice;

@Service
public class EmpolyeeserviceIMPL implements Empolyeeservice{
	
	@Autowired
    private EmpolyeeRepo empolyeeRepo;
	
	@Override
	public Empolyee addEmpolyee(Empolyee empolyee) {
		
		
		Empolyee emp =empolyeeRepo.save(null);
		return emp;
	}

	@Override
	public String removeEmpolyee(int id) {
		empolyeeRepo.deleteById(id);
		return "delete data suceessfully";
	}

	@Override
	
	public Optional<Empolyee> findEmpById(int id) {
		Optional<Empolyee> emp =empolyeeRepo.findById(null);
		
		if(emp.isPresent()) {
			
		return emp;

		}else {
			
		return null;
		}
	}
	

	@Override
	public List<Empolyee> getAllEmpolyee() {
		
		List<Empolyee> empList =empolyeeRepo.findAll();
		return empList;
	}

	@Override
	public String updateEmpolyee(int id) {
		
	 Optional<Empolyee> emp=empolyeeRepo.findById(id);
	 if(emp.isPresent()) {
		 
		 Empolyee emps=new Empolyee();
		 
		 empolyeeRepo.save(emps);
		 return "updated sucessfully";
		 
	 }else {
	   
		 return "Empolyee not found";
	}
	}
}

	

