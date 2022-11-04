package com.team4.luma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.team4.luma.model.LoanCardMaster;

@Repository
public interface LoanCardRepository extends JpaRepository<LoanCardMaster, Long> {

}
