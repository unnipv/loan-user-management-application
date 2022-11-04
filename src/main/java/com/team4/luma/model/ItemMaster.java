package com.team4.luma.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ItemMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long itemId;
	
	private String itemDescription;
	
	private String itemStatus;
	
	private String itemMake;
	
	private String itemCategory;
	
	private Long valuation;
	
	
	
	public ItemMaster() {
		super();
	}
	
	
	
	public ItemMaster(String itemDescription, String itemStatus, String itemMake, String itemCategory, Long valuation) {
		super();
		this.itemDescription = itemDescription;
		this.itemStatus = itemStatus;
		this.itemMake = itemMake;
		this.itemCategory = itemCategory;
		this.valuation = valuation;
	}



	public Long getId() {
		return itemId;
	}

	public void setId(Long id) {
		this.itemId = id;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	public String getItemMake() {
		return itemMake;
	}

	public void setItemMake(String itemMake) {
		this.itemMake = itemMake;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public Long getValuation() {
		return valuation;
	}

	public void setValuation(Long valuation) {
		this.valuation = valuation;
	}
	
}
