package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Shift1Stock;
import com.example.demo.Services.Shift1StockServices;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping(value="/shift1")
@Transactional	
public class Shift1StockController {
	@Autowired
	Shift1StockServices stockService;
	
	@PostMapping(value="/add")
	public void addStock(@RequestParam String material,@RequestParam int quantity) {
		stockService.addstock(material, quantity);
	}
	@GetMapping(value="/stock")
	public List<Shift1Stock> getStock(@RequestParam String material) {
		return stockService.getStock(material);
	}
	

}
