package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import com.example.demo.Entity.Shift1Stock;


public interface ShiftStock1Repository extends JpaRepository<Shift1Stock, Integer> {
	@Procedure
	public void AddStock_Shift1(String material,int quantity);
	@Procedure
	List<Shift1Stock> GetStock_Shift1(String material);


}
