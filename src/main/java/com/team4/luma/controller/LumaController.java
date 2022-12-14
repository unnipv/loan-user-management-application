package com.team4.luma.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.team4.luma.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team4.luma.entity.ItemEntity;
import com.team4.luma.service.EmployeeService;
import com.team4.luma.service.ItemService;
import com.team4.luma.service.LoanService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class LumaController {
	
	@Autowired 
	private EmployeeService empService;
	
	@Autowired
	private ItemService itemService;
	
	@Autowired
	private LoanService loanService;

	@GetMapping("/test")
	public String test() {
		return "Working";
	}
	
	@PostMapping("/register")
	public ResponseEntity<String> employeeRegistration(@RequestBody EmployeeDto employeeDto){
		
		try{
			empService.registerUserToDb(employeeDto);
			return new ResponseEntity<String>("employee added", null, 201);
		}
		catch(Exception e) {
			return new ResponseEntity<String>("Invalid employee details", null, 400);
		}
		
	}
	
	@PostMapping("/login")
	public ResponseEntity<EmployeeDto> employeeLogin(@RequestBody LoginDto loginDto){
		try{
			System.out.println(loginDto);
			Optional<EmployeeDto> employee = empService.validateEmployee(loginDto);
			return new ResponseEntity<EmployeeDto>(employee.get(), null, 200);
		}
		catch(Exception e) {
			return new ResponseEntity<EmployeeDto>(null, null, 400);
		}
	}
	
	
	@PostMapping("/applyforloan")
	public ResponseEntity<String> applyforloan(@RequestBody ApplyLoanDto applyLoanDto){
		try{
			System.out.println(applyLoanDto);
			loanService.applyForLoan(applyLoanDto);
			return new ResponseEntity<String>("Loan sanctioned", null, 200);
		}
		catch (Exception e){
			return new ResponseEntity<String>("Error In Loan Creation", null, 400);
		}
	}
	
	
	@GetMapping("/loans/{employeeId}")
	public List<LoansListDto> getAllLoans(@PathVariable(value = "employeeId") String employeeId){
		try{
			List<LoansListDto> loans = loanService.getLoansByEmpId(employeeId);
			return loans;
		}
		catch(Exception e) {
			return new ArrayList<>();
		}

	}
	
	@GetMapping("/items/{employeeId}")
	public List<ItemListDto> getAllItemsPurchased(@PathVariable(value = "employeeId") String employeeId){
		try{
			List<ItemListDto> items = itemService.getItemsByEmpId(employeeId);
			return items;
		}
		catch(Exception e) {
			return new ArrayList<>();
		}
	}
	
	
	@GetMapping("/item_category")
	public List<String> getAllItemCategories(){
		
		return itemService.getAllCategories();
	}
	
	@GetMapping("/item_make/{category}")
	public List<String> getAllItemMakeType(@PathVariable String category){
		return itemService.getItemMakeByCategory(category);
	}
	
	@GetMapping("/all_items/{category}/{make}")
	public List<ItemEntity> getAllItemList(@PathVariable String category, @PathVariable String make){
		return itemService.getItemByCategoryAndMake(category, make);
	}
}
