package com.team4.luma.service;

import com.team4.luma.dto.EmployeeDto;
import com.team4.luma.dto.LoginDto;

public interface EmployeeService {

	void registerUserToDb(EmployeeDto empDto) throws Exception;

	void validateEmployee(LoginDto loginDto) throws Exception;

}