package com.team4.luma.repository;

import java.util.Optional;

import com.team4.luma.entity.LoanCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.team4.luma.entity.EmployeeMasterEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeMasterEntity, String> {

	Optional<EmployeeMasterEntity> findById(String employeeId);

	@Query(nativeQuery = true, value= "SELECT * FROM EmployeeMasterEntity e WHERE e.employee_id = ?1")
	EmployeeMasterEntity getEmployeeMasterById(String employee_id);
}
