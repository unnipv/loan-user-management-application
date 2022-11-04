package com.team4.luma.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team4.luma.dto.EmployeeDto;
import com.team4.luma.dto.LoginDto;
import com.team4.luma.entity.ItemEntity;
import com.team4.luma.service.EmployeeService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class LumaController {
	
	@Autowired 
	private EmployeeService empService;
	
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
	public ResponseEntity<String> employeeLogin(@RequestBody LoginDto loginDto){
		try{
			empService.validateEmployee(loginDto);
			return new ResponseEntity<String>("Login successful", null, 200);
		}
		catch(Exception e) {
			return new ResponseEntity<String>("Invalid credentials", null, 400);
		}
	}
	
	
	@PostMapping("/applyforloan")
	public ResponseEntity<String> applyforloan(@RequestBody LoginDto loginDto){
		return new ResponseEntity<String>("Loan sanctioned", null, 200);
	}
	
	@GetMapping("/loans/{employeeId}")
	public ResponseEntity<String> getAllLoans(@PathParam(value = "employeeId") String employeeId){
		return new ResponseEntity<String>("Loan sanctioned", null, 200);
	}
	
	@GetMapping("/items/{employeeId}")
	public ResponseEntity<String> getAllItemsPurchased(@PathParam(value = "employeeId") String employeeId){
		return new ResponseEntity<String>("Loan sanctioned", null, 200);
	}
	
	@GetMapping("/item_category")
	public List<String> getAllItemCategories(){
		return new ArrayList<>();
	}
	
	@GetMapping("/item_make/{category}")
	public List<String> getAllItemMakeType(@PathParam(value = "category") String category){
		return new ArrayList<>();
	}
	
	@GetMapping("/all_items/{category}/{make}")
	public List<ItemEntity> getAllItemList(@PathParam(value = "category") String category, @PathParam("make") String make){
		return new ArrayList<>();
	}
}
