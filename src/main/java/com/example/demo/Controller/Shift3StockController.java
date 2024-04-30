package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Shift3Stock;
import com.example.demo.Services.Shift3StockServices;

@RestController
@RequestMapping(value="/Shift3")
public class Shift3StockController {
	@Autowired
	Shift3StockServices stockService;
	
	@PostMapping(value="/add")
	public void addStock(@RequestParam String material,@RequestParam int quantity) {
		stockService.addstock(material, quantity);
	}
	@GetMapping(value="/stock")
	public List<Shift3Stock> getStock(@RequestParam String material) {
		return stockService.getStock(material);
	}

}
