package com.team4.luma.dto;

import java.util.Date;


public class LoansListDto {
	private Long loan_id;

    private String loan_type;

    private int duration_in_years;
    
    private Date card_issue_date;

	public Long getLoan_id() {
		return loan_id;
	}

	public void setLoan_id(Long loan_id) {
		this.loan_id = loan_id;
	}

	public String getLoan_type() {
		return loan_type;
	}

	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}

	public int getDuration_in_years() {
		return duration_in_years;
	}

	public void setDuration_in_years(int duration_in_years) {
		this.duration_in_years = duration_in_years;
	}

	public Date getCard_issue_date() {
		return card_issue_date;
	}

	public void setCard_issue_date(Date card_issue_date) {
		this.card_issue_date = card_issue_date;
	}
    
    
}
