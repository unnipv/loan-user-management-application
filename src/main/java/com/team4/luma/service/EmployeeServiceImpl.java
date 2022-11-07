package com.team4.luma.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.luma.dto.EmployeeDto;
import com.team4.luma.dto.LoginDto;
import com.team4.luma.entity.EmployeeMasterEntity;
import com.team4.luma.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public void registerUserToDb(EmployeeDto empDto) throws Exception {
		Optional<EmployeeMasterEntity> employeeMaster = empRepo.findById(empDto.getEmployeeId());
		if(employeeMaster.isPresent()) {
			System.out.println("User with Empid already exists!");
			throw new Exception("User with Empid already exists!");
		}
		else {
			EmployeeMasterEntity employee = new EmployeeMasterEntity();
			employee.setEmployee_id(empDto.getEmployeeId());
			employee.setEmployee_name(empDto.getEmployeeName());
			employee.setPassword(empDto.getPassword());
			employee.setDate_of_birth(empDto.getDateOfBirth());
			employee.setDate_of_joining(empDto.getDateOfJoining());
			employee.setDepartment(empDto.getDepartment());
			employee.setDesignation(empDto.getDesignation());
			employee.setGender(empDto.getGender());
			empRepo.save(employee);
			empRepo.flush();
		}
		
	}

	@Override
	public void validateEmployee(LoginDto loginDto) throws Exception {
		Optional<EmployeeMasterEntity> employee = empRepo.findById(loginDto.getEmployeeId());
		if(employee.isPresent() && employee.get().getPassword().equals(loginDto.getPassword())) {
			System.out.println("Login Success");
			return;
		}
		else {
			System.out.println("Login Failed");
			throw new Exception("invalid credentials");
		}
	}
	
	
}
