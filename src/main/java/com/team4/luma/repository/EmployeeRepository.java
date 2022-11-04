package com.team4.luma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.team4.luma.model.EmployeeMaster;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeMaster, String> {
	
}
