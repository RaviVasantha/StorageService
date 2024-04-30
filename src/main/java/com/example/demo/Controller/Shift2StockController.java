package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entity.Shift2Stock;
import com.example.demo.Services.Shift2StockServices;
import jakarta.transaction.Transactional;
@RestController
@RequestMapping(value="/Shift2")
@Transactional	
public class Shift2StockController {
	@Autowired
	Shift2StockServices stockService;
	
	@PostMapping(value="/add")
	public void addStock(@RequestParam String material,@RequestParam int quantity) {
		stockService.addstock(material, quantity);
	}
	@GetMapping(value="/stock")
	public List<Shift2Stock> getStock(@RequestParam String material) {
		return stockService.getStock(material);
	}

}
