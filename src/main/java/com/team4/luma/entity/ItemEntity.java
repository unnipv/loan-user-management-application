package com.team4.luma.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
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
}
