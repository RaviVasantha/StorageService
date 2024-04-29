package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.Shift2Stock;
import com.example.demo.Repository.ShiftStock2Repository;

@Service
public class Shift2StockServices {
	@Autowired
	ShiftStock2Repository stockRepo;
	
	public void addstock(String material,int quantity) {
		stockRepo.AddStock_Shift2(material, quantity);
	}
	
	public List<Shift2Stock> getStock(String material) {
		return stockRepo.GetStock_Shift2(material);
		
	}


}
