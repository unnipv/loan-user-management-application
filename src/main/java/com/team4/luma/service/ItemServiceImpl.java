package com.team4.luma.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.luma.dto.ItemListDto;
import com.team4.luma.entity.ItemEntity;
import com.team4.luma.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemRepository itemRepo;
	
	@Override
	public List<String> getAllCategories() {
		return itemRepo.getDistictCategory();
	}

	@Override
	public List<String> getItemMakeByCategory(String category) {
		return itemRepo.getItemMakeByCategory(category);
	}

	@Override
	public List<ItemEntity> getItemByCategoryAndMake(String category, String make) {
		return itemRepo.getItemByCategoryAndMake(category, make);
	}

	@Override
	public List<ItemListDto> getItemsByEmpId(String employeeId) {
		List<ItemListDto> itemList = new ArrayList<>();
		for(List<String> row : itemRepo.getItemsByEmpId(employeeId)) {
			ItemListDto item = new ItemListDto();
			item.setIssue_id(Long.parseLong(row.get(0)));
			item.setItem_category(row.get(2));
			item.setItem_description(row.get(4));
			item.setItem_make(row.get(1));
			item.setItem_valuation(Integer.parseInt(row.get(3)));
			itemList.add(item);
		}
		return itemList;
	}

	
}
