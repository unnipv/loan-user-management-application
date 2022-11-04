package com.team4.luma.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="loan_card_master")
public class LoanCardEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "loan_id")
    private Long loan_id;
	
	@Column(name = "loan_type")
    private String loan_type;
	
	@Column(name = "duration_in_years")
    private int duration_in_years;
}
