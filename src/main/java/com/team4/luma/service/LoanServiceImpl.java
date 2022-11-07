package com.team4.luma.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.luma.dto.LoansListDto;
import com.team4.luma.repository.LoanCardRepository;

@Service
public class LoanServiceImpl implements LoanService {
	
	@Autowired
	LoanCardRepository loanRepo;
	
	@Override
	public List<LoansListDto> getLoansByEmpId(String employeeId) {
		List<LoansListDto> loanList = new ArrayList<>();
		for(List<String> row : loanRepo.getLoansByEmpId(employeeId)) {
			LoansListDto loan = new LoansListDto();
			loan.setLoan_id(Long.parseLong(row.get(0)));
			loan.setLoan_type(row.get(1));
			loan.setDuration_in_years(Integer.parseInt(row.get(2)));
			try {
				loan.setCard_issue_date(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(row.get(3)));
			} catch (ParseException e) {
				loan.setCard_issue_date(null);
			}
			loanList.add(loan);
		}
		return loanList;
	}

}
