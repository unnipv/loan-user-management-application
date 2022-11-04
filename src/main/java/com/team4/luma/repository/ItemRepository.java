package com.team4.luma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.team4.luma.entity.ItemEntity;


@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, Long> {

}
