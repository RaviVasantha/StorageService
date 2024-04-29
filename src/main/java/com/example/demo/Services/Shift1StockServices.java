package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Shift1Stock;
import com.example.demo.Repository.ShiftStock1Repository;

@Service
public class Shift1StockServices {
	@Autowired
	ShiftStock1Repository stockRepo;
	
	public void addstock(String material,int quantity) {
		stockRepo.AddStock_Shift1(material, quantity);
	}
	
	public List<Shift1Stock> getStock(String material) {
		return stockRepo.GetStock_Shift1(material);
		
	}

}
