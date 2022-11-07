package com.team4.luma;

import java.util.Date;
import java.util.HashSet;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.team4.luma.entity.EmployeeIssueEntity;
import com.team4.luma.entity.EmployeeMasterEntity;
import com.team4.luma.entity.ItemEntity;
import com.team4.luma.entity.LoanCardEntity;
import com.team4.luma.repository.EmployeeIssueEntityReposity;
import com.team4.luma.repository.EmployeeRepository;
import com.team4.luma.repository.ItemRepository;
import com.team4.luma.repository.LoanCardRepository;

@SpringBootTest
class LumaApplicationTests {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	@Autowired
	private ItemRepository itemRepo;
	
	@Autowired
	private LoanCardRepository loanCardRepo;
	
	@Autowired
	private EmployeeIssueEntityReposity issueRepo;
	
	
//	@Test
//	void contextLoads() {
//		Optional<EmployeeMasterEntity> employee = empRepo.findById("E1234");
//		if(employee.isPresent()) {
//			System.out.println(employee.get().getItems());
//			return;
//		}
//		else {
//			System.out.println("Failed");
//		}
//	}
	
//	@Test
//	void contextLoads() {
//		EmployeeMasterEntity employee = new EmployeeMasterEntity();
//		employee.setEmployee_id("E1234");
//		employee.setEmployee_name("RPS");
//		employee.setPassword("admin");
//		employee.setDate_of_birth((new Date(1999,8,20)));
//		employee.setDate_of_joining(new Date(2022,8,20));
//		employee.setDepartment("Technology");
//		employee.setDesignation("Associate");
//		empRepo.save(employee);
//	}
//	
//	@Test
//	void addItem() {
//		ItemEntity item = new ItemEntity();
//		item.setItem_category("Furniture");
//		item.setItem_description("Wooden Chair");
//		item.setItem_make("wood");
//		item.setItem_valuation(2500);
//		item.setIssue_status('Y');
//		itemRepo.save(item);
//	}
//	
//	@Test
//	void addLoanCard() {
//		LoanCardEntity loanCard = new LoanCardEntity();
//		loanCard.setLoan_type("Furniture");
//		loanCard.setDuration_in_years(2);
//		loanCardRepo.save(loanCard);
//	}
//	
	@Test
	void additemtoemployee() {
		EmployeeMasterEntity employee = new EmployeeMasterEntity();
		employee.setEmployee_id("E1234");
		employee.setEmployee_name("RPS");
		employee.setPassword("admin");
		employee.setDate_of_birth((new Date(1999,8,20)));
		employee.setDate_of_joining(new Date(2022,8,20));
		employee.setDepartment("Technology");
		employee.setDesignation("Associate");
		employee.setItems(new HashSet<>());
		employee.setItems(new HashSet<>());
		empRepo.save(employee);
		
		ItemEntity item = new ItemEntity();
		item.setItem_category("Furniture");
		item.setItem_description("Wooden Chair");
		item.setItem_make("wood");
		item.setItem_valuation(2500);
		item.setIssue_status('Y');
		itemRepo.save(item);
		
		
		EmployeeIssueEntity issue = new EmployeeIssueEntity();
		issue.setIssue_date(new Date(2022, 11, 8));
		issue.setReturn_date(new Date(2022, 12, 8));
		issue.setEmployeeMasterEntity(employee);
		issue.setItemEntity(item);
		issueRepo.save(issue);
		
		employee.getItems().add(issue);
		empRepo.save(employee);
		
		
	}
	
	
}
