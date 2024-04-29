package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Shift3Stock;
import com.example.demo.Repository.ShiftStock3Repository;

@Service
public class Shift3StockServices {
	@Autowired
	ShiftStock3Repository stockRepo;
	
	public void addstock(String material,int quantity) {
		stockRepo.AddStock_Shift3(material, quantity);
	}
	
	public List<Shift3Stock> getStock(String material) {
		return stockRepo.GetStock_Shift3(material);
		
	}


}
