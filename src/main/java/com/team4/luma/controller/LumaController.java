package com.team4.luma.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.team4.luma.dto.EmployeeDto;
import com.team4.luma.dto.LoginDto;

@RestController
public class LumaController {
	
	@GetMapping("/test")
	public String test() {
		return "Working";
	}
	
	@PostMapping("/register")
	public ResponseEntity<String> employeeRegistration(@RequestBody EmployeeDto employeeDto){
		return new ResponseEntity<String>("employee added", null, 201);
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> employeeLogin(@RequestBody LoginDto loginDto){
		return new ResponseEntity<String>("Login success", null, 200);
	}
	
	@PostMapping("/applyforloan")
	public ResponseEntity<String> applyforloan(@RequestBody LoginDto loginDto){
		return new ResponseEntity<String>("Loan sanctioned", null, 200);
	}
	
	@GetMapping("/loans")
	public ResponseEntity<String> getAllLoans(@RequestParam String empId){
		return new ResponseEntity<String>("Loan sanctioned", null, 200);
	}
	
	@GetMapping("/items")
	public ResponseEntity<String> getAllItemsPurchased(@RequestParam String empId){
		return new ResponseEntity<String>("Loan sanctioned", null, 200);
	}
}
