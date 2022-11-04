package com.team4.luma.entity;

import java.util.Date;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
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
}