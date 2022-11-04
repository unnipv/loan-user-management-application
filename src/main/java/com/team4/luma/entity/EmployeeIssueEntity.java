package com.team4.luma.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="employee_issue_master")
public class EmployeeIssueEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="issue_id")
    private Long issue_id;
	
	@ManyToOne
    @JoinColumn(name = "employee_id")
	private EmployeeMasterEntity employeeMasterEntity;
	
	@ManyToOne
    @JoinColumn(name = "item_id")
	private ItemEntity itemEntity;
	
	@Column(name = "issue_date")
    private Date issue_date;
	
	@Column(name = "return_date")
    private Date return_date;
}
