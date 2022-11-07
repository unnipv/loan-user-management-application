package com.team4.luma.entity;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="employee_master")
public class EmployeeMasterEntity {
	@Id
	@Column(name = "employee_id")
    private String employee_id;
	
	@Column(name = "employee_name")
    private String employee_name;

	@Column(name = "designation")
    private String designation;

	@Column(name = "department")
    private String department;
	
	@Column(name = "gender")
    private String gender;
	
	@Column(name = "date_of_birth")
    private Date date_of_birth;
	
	@Column(name = "date_of_joining")
    private Date date_of_joining;
	
	@Column(name = "password")
	private String password;
	
	@OneToMany(mappedBy="id")
    private Set<EmployeeCardEntity> loanCards;
	
	@OneToMany(mappedBy="issue_id")
    private Set<EmployeeIssueEntity> items;

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public Date getDate_of_joining() {
		return date_of_joining;
	}

	public void setDate_of_joining(Date date_of_joining) {
		this.date_of_joining = date_of_joining;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<EmployeeCardEntity> getLoanCards() {
		return loanCards;
	}

	public void setLoanCards(Set<EmployeeCardEntity> loanCards) {
		this.loanCards = loanCards;
	}

	public Set<EmployeeIssueEntity> getItems() {
		return items;
	}

	public void setItems(Set<EmployeeIssueEntity> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "EmployeeMasterEntity [employee_id=" + employee_id + ", employee_name=" + employee_name
				+ ", designation=" + designation + ", department=" + department + ", gender=" + gender
				+ ", date_of_birth=" + date_of_birth + ", date_of_joining=" + date_of_joining + ", password=" + password
				+ ", items=" + items + "]";
	}
	
	
	
}
