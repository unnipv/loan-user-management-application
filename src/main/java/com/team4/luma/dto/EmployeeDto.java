package com.team4.luma.dto;

import java.util.Date;

public class EmployeeDto {
	private String employeeId;
	private String employeeName;
	private String designation;
	private String department;
	private String password;
	private String gender;
	private Date dateOfBirth;
	private Date dateOfJoining;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	public EmployeeDto() {
		super();
	}
	public EmployeeDto(String employeeId, String employeeName, String designation, String department, String password,
			String gender, Date dateOfBirth, Date dateOfJoining) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.designation = designation;
		this.department = department;
		this.password = password;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoining = dateOfJoining;
	}
	
	
}
