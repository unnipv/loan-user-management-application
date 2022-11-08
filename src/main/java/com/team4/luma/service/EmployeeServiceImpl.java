package com.team4.luma.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.luma.dto.EmployeeDto;
import com.team4.luma.dto.LoginDto;
import com.team4.luma.entity.EmployeeMasterEntity;
import com.team4.luma.repository.EmployeeRepository;
import com.team4.luma.utility.EmployeeDtoConverter;

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
			EmployeeMasterEntity employee = EmployeeDtoConverter.getEmployeeEntity(empDto);
			empRepo.save(employee);
			empRepo.flush();
		}
		
	}

	@Override
	public Optional<EmployeeDto> validateEmployee(LoginDto loginDto) throws Exception {
		Optional<EmployeeMasterEntity> employee = empRepo.findById(loginDto.getEmployeeId());
		if(employee.isPresent() && employee.get().getPassword().equals(loginDto.getPassword())) {
			System.out.println("Login Success");
			return Optional.of(EmployeeDtoConverter.getEmployeeDto(employee.get()));
		}
		else {
			System.out.println("Login Failed");
			throw new Exception("invalid credentials");
		}
	}
	
	
}
