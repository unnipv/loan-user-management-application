package com.team4.luma.service;

import java.util.Optional;

import com.team4.luma.dto.EmployeeDto;
import com.team4.luma.dto.LoginDto;

public interface EmployeeService {

	void registerUserToDb(EmployeeDto empDto) throws Exception;

	Optional<EmployeeDto> validateEmployee(LoginDto loginDto) throws Exception;

}