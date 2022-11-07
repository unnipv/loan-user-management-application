package com.team4.luma.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.team4.luma.dto.ApplyLoanDto;
import com.team4.luma.entity.*;
import com.team4.luma.repository.*;
import net.bytebuddy.build.Plugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.luma.dto.LoansListDto;

@Service
public class LoanServiceImpl implements LoanService {
	
	@Autowired
	LoanCardRepository loanRepo;

	@Autowired
	private EmployeeRepository empRepo;

	@Autowired
	private ItemRepository itemRepo;

	@Autowired
	private EmployeeCardEntityRepository empCardEntityRepo;

	@Autowired
	private EmployeeIssueEntityReposity empIssueEntityRepo;
	
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

	@Override
	public void applyForLoan(ApplyLoanDto applyLoanDto) throws Exception{
//		EmployeeMasterEntity employee = empRepo.getEmployeeMasterById(applyLoanDto.getEmployeeId());
//		LoanCardEntity loan = loanRepo.getLoanById(applyLoanDto.getLoan_id());
//		ItemEntity item = itemRepo.getItemById(applyLoanDto.getItem_id());

		Optional<EmployeeMasterEntity> employee = empRepo.findById(applyLoanDto.getEmployeeId());
		Optional<LoanCardEntity> loan = loanRepo.findById(applyLoanDto.getLoan_id());
		Optional<ItemEntity> item = itemRepo.findById(applyLoanDto.getItem_id());
		if(employee.isPresent() && item.isPresent() && loan.isPresent()) {

			//working
			EmployeeMasterEntity employeeEntity = employee.get();
			LoanCardEntity loanEntity = loan.get();
			ItemEntity itemEntity = item.get();

			EmployeeCardEntity employeeCardEntity = new EmployeeCardEntity();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
			employeeCardEntity.setCard_issue_date(new Date());
			employeeCardEntity.setLoanCardEntity(loanEntity);
			employeeCardEntity.setEmployeeMasterEntity(employeeEntity);
			empCardEntityRepo.save(employeeCardEntity);

			EmployeeIssueEntity employeeIssueEntity = new EmployeeIssueEntity();
			employeeIssueEntity.setIssue_date(new Date());
			employeeIssueEntity.setItemEntity(itemEntity);
			employeeIssueEntity.setEmployeeMasterEntity(employeeEntity);
			empIssueEntityRepo.save(employeeIssueEntity);
			return;
		}
		else {
			System.out.println("invalid details passed");
			throw new Exception("Please enter correct details");
		}
	}

}
