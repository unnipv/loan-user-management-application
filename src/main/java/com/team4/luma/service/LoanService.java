package com.team4.luma.service;

import java.util.List;

import com.team4.luma.dto.LoansListDto;

public interface LoanService {

	List<LoansListDto> getLoansByEmpId(String employeeId);

}