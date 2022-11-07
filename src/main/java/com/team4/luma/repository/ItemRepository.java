package com.team4.luma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.team4.luma.entity.ItemEntity;


@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, Long> {
	
	@Query("SELECT DISTINCT i.item_category FROM ItemEntity i")
	List<String> getDistictCategory();

	@Query("SELECT DISTINCT i.item_make FROM ItemEntity i where i.item_category = ?1")
	List<String> getItemMakeByCategory(String category);
	
	@Query("FROM ItemEntity i WHERE i.item_category = ?1 AND i.item_make = ?2")
	List<ItemEntity> getItemByCategoryAndMake(String category, String make);
	
	@Query(nativeQuery = true,
			value = "select A.issue_id, B.item_make, B.item_category, B.item_valuation, B.item_description From employee_issue_master A INNER JOIN item_master B ON A.item_id = B.item_id WHERE A.employee_id = ?1")
	List<List<String>> getItemsByEmpId(String employeeId);

}
