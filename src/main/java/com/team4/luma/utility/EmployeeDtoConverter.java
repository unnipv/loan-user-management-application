package com.team4.luma.utility;

import com.team4.luma.dto.EmployeeDto;
import com.team4.luma.entity.EmployeeMasterEntity;

public class EmployeeDtoConverter {
	public static EmployeeDto getEmployeeDto(EmployeeMasterEntity employeeEntity) {
		EmployeeDto dto = new EmployeeDto();
		dto.setEmployeeId(employeeEntity.getEmployee_id());
		dto.setEmployeeName(employeeEntity.getEmployee_name());
		dto.setDateOfBirth(employeeEntity.getDate_of_birth());
		dto.setDateOfJoining(employeeEntity.getDate_of_joining());
		dto.setDepartment(employeeEntity.getDepartment());
		dto.setDesignation(employeeEntity.getDesignation());
		dto.setGender(employeeEntity.getGender());
		return dto;
		
	}
	
	public static EmployeeMasterEntity getEmployeeEntity(EmployeeDto empDto) {
		EmployeeMasterEntity employee = new EmployeeMasterEntity();
		employee.setEmployee_id(empDto.getEmployeeId());
		employee.setEmployee_name(empDto.getEmployeeName());
		employee.setPassword(empDto.getPassword());
		employee.setDate_of_birth(empDto.getDateOfBirth());
		employee.setDate_of_joining(empDto.getDateOfJoining());
		employee.setDepartment(empDto.getDepartment());
		employee.setDesignation(empDto.getDesignation());
		employee.setGender(empDto.getGender());
		return employee;
	}
}
