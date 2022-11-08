package com.team4.luma.repository;

import java.util.List;

import com.team4.luma.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.team4.luma.entity.LoanCardEntity;


@Repository
public interface LoanCardRepository extends JpaRepository<LoanCardEntity, Long> {

	@Query(nativeQuery = true, 
			value ="Select l.loan_id, l.loan_type, l.duration_in_years, e.card_issue_date FROM loan_card_master l INNER JOIN employee_card_details e where e.employee_id = ?1 AND l.loan_id = e.loan_id")
	List<List<String>> getLoansByEmpId(String employeeId);

	@Query(nativeQuery = true, value= "SELECT * FROM LoanCardEntity l WHERE l.loan_id = ?1")
	LoanCardEntity getLoanById(Long loan_id);

	@Query(nativeQuery = true,
			value = "SELECT * FROM LoanCardEntity l where l.loan_type = ?1")
	LoanCardEntity getLoansByItemCategory(String item_category);
}
