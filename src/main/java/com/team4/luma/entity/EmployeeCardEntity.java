package com.team4.luma.entity;

import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="employee_card_details")
public class EmployeeCardEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
	
	@ManyToOne
    @JoinColumn(name = "loan_id")
	private LoanCardEntity loanCardEntity;
	
	@Column(name = "card_issue_date")
    private Date card_issue_date;
	
	@ManyToOne
    @JoinColumn(name = "employee_id")
    private EmployeeMasterEntity employeeMasterEntity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LoanCardEntity getLoanCardEntity() {
		return loanCardEntity;
	}

	public void setLoanCardEntity(LoanCardEntity loanCardEntity) {
		this.loanCardEntity = loanCardEntity;
	}

	public Date getCard_issue_date() {
		return card_issue_date;
	}

	public void setCard_issue_date(Date card_issue_date) {
		this.card_issue_date = card_issue_date;
	}

	public EmployeeMasterEntity getEmployeeMasterEntity() {
		return employeeMasterEntity;
	}

	public void setEmployeeMasterEntity(EmployeeMasterEntity employeeMasterEntity) {
		this.employeeMasterEntity = employeeMasterEntity;
	}
	
	
}