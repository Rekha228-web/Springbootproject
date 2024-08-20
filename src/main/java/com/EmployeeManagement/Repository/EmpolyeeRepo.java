package com.EmployeeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeManagement.model.Empolyee;

public interface EmpolyeeRepo extends JpaRepository<Empolyee,Integer> {

}
