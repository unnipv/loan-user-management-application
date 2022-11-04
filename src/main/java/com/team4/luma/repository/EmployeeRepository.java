package com.team4.luma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.team4.luma.model.EmployeeMaster;

public interface EmployeeRepository extends JpaRepository<EmployeeMaster, String> {
	
}
