package com.team4.luma.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeCardDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String employee_id;
	
	private Long loan_id;
	
	private Date card_issue_date;

	public EmployeeCardDetails() {
		super();
	}

	public EmployeeCardDetails(String employee_id, Long loan_id, Date card_issue_date) {
		super();
		this.employee_id = employee_id;
		this.loan_id = loan_id;
		this.card_issue_date = card_issue_date;
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public Long getLoan_id() {
		return loan_id;
	}

	public void setLoan_id(Long loan_id) {
		this.loan_id = loan_id;
	}

	public Date getCard_issue_date() {
		return card_issue_date;
	}

	public void setCard_issue_date(Date card_issue_date) {
		this.card_issue_date = card_issue_date;
	}
	
	
}
