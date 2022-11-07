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


@Entity
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

	public Long getIssue_id() {
		return issue_id;
	}

	public void setIssue_id(Long issue_id) {
		this.issue_id = issue_id;
	}

	public EmployeeMasterEntity getEmployeeMasterEntity() {
		return employeeMasterEntity;
	}

	public void setEmployeeMasterEntity(EmployeeMasterEntity employeeMasterEntity) {
		this.employeeMasterEntity = employeeMasterEntity;
	}

	public ItemEntity getItemEntity() {
		return itemEntity;
	}

	public void setItemEntity(ItemEntity itemEntity) {
		this.itemEntity = itemEntity;
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
