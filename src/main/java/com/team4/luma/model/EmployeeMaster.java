package com.team4.luma.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class EmployeeMaster {
	String employeeId;
	String employeeName;
    String designation;
	String department;
    Character gender;
    Date dateOfBirth;
    Date dateOfJoining;
    
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
	public Character getGender() {
		return gender;
	}
	public void setGender(Character gender) {
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
	
	@Override
	public String toString() {
		return "EmployeeMaster [employeeId=" + employeeId + ", employeeName=" + employeeName + ", designation="
				+ designation + ", department=" + department + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth
				+ ", dateOfJoining=" + dateOfJoining + "]";
	}
	
}
