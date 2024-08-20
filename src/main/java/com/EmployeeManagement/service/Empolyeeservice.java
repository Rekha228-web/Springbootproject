package com.EmployeeManagement.service;

import java.util.List;
import java.util.Optional;

import com.EmployeeManagement.model.Empolyee;

public interface Empolyeeservice {
	
	public Empolyee addEmpolyee(Empolyee empolyee );
	
	
	public String removeEmpolyee(int id);
	
	public Optional<Empolyee> findEmpById(int id);
	
	public List<Empolyee> getAllEmpolyee();
	
	public  String updateEmpolyee(int id);
	
	

}
