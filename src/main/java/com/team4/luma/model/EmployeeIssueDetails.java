package com.team4.luma.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeIssueDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long issue_id;

	private Long employee_id;
	
	private Long item_id;
	
	private Date issue_date;
	
	private Date return_date;

	public EmployeeIssueDetails() {
		super();
	}

	public EmployeeIssueDetails(Long employee_id, Long item_id, Date issue_date, Date return_date) {
		super();
		this.employee_id = employee_id;
		this.item_id = item_id;
		this.issue_date = issue_date;
		this.return_date = return_date;
	}

	public Long getIssue_id() {
		return issue_id;
	}

	public void setIssue_id(Long issue_id) {
		this.issue_id = issue_id;
	}

	public Long getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Long employee_id) {
		this.employee_id = employee_id;
	}

	public Long getItem_id() {
		return item_id;
	}

	public void setItem_id(Long item_id) {
		this.item_id = item_id;
	}

	public Date getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}

	public Date getReturn_date() {
		return return_date;
	}

	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}
	
	
	
}
