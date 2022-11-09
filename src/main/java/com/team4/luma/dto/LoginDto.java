package com.team4.luma.dto;

public class LoginDto {
	private String employeeId;
	private String password;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginDto [employeeId=" + employeeId + ", password=" + password + "]";
	}
	public LoginDto() {
		super();
	}
	
	
}
