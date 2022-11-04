package com.team4.luma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.luma.dto.EmployeeDto;
import com.team4.luma.dto.LoginDto;
import com.team4.luma.model.EmployeeMaster;
import com.team4.luma.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	public void registerUserToDb(EmployeeDto empDto) {
		EmployeeMaster employee = new EmployeeMaster();
		employee.setEmployeeId(empDto.getEmployeeId());
		employee.setEmployeeName(empDto.getEmployeeName());
		employee.setEmployeePassword(empDto.getPassword());
		employee.setDateOfBirth(empDto.getDateOfBirth());
		employee.setDateOfJoining(empDto.getDateOfJoining());
		employee.setDepartment(empDto.getDepartment());
		employee.setDesignation(empDto.getDesignation());
		empRepo.save(employee);
	}

	public void validateEmployee(LoginDto loginDto) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
