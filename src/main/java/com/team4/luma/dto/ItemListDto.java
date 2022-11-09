package com.team4.luma.dto;

public class ItemListDto {
	
	private Long issue_id;
	private String item_description;
	private String item_make;
	private String item_category;
	
    private int item_valuation;
    
    
    
	public ItemListDto() {
		super();
	}

	

	public ItemListDto(Long issue_id, String item_description, String item_make, String item_category,
			int item_valuation) {
		super();
		this.issue_id = issue_id;
		this.item_description = item_description;
		this.item_make = item_make;
		this.item_category = item_category;
		this.item_valuation = item_valuation;
	}



	public Long getIssue_id() {
		return issue_id;
	}



	public void setIssue_id(Long issue_id) {
		this.issue_id = issue_id;
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



	@Override
	public String toString() {
		return "ItemListDto [issue_id=" + issue_id + ", item_description=" + item_description + ", item_make="
				+ item_make + ", item_category=" + item_category + ", item_valuation=" + item_valuation + "]";
	}

	
    
}
