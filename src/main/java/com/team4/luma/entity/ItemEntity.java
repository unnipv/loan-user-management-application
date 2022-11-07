package com.team4.luma.entity;

import javax.persistence.*;


@Entity
@Table(name="item_master")
public class ItemEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="item_id")
    private Long item_id;
	
	@Column(name="item_description")
    private String item_description;
	
	@Column(name="item_make")
    private String item_make;
	
	@Column(name="issue_status")
    private Character issue_status;
	
	@Column(name="item_category")
    private String item_category;
	
	@Column(name="item_valuation")
    private int item_valuation;

	public Long getItem_id() {
		return item_id;
	}

	public void setItem_id(Long item_id) {
		this.item_id = item_id;
	}

	public String getItem_description() {
		return item_description;
	}

	public void setItem_description(String item_description) {
		this.item_description = item_description;
	}

	public String getItem_make() {
		return item_make;
	}

	public void setItem_make(String item_make) {
		this.item_make = item_make;
	}

	public Character getIssue_status() {
		return issue_status;
	}

	public void setIssue_status(Character issue_status) {
		this.issue_status = issue_status;
	}

	public String getItem_category() {
		return item_category;
	}

	public void setItem_category(String item_category) {
		this.item_category = item_category;
	}

	public int getItem_valuation() {
		return item_valuation;
	}

	public void setItem_valuation(int item_valuation) {
		this.item_valuation = item_valuation;
	}
	
	
}
