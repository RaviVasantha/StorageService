package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import com.example.demo.Entity.Shift2Stock;

public interface ShiftStock2Repository extends JpaRepository<Shift2Stock, Integer>{
	@Procedure
	public void AddStock_Shift2(String material,int quantity);
	@Procedure
	List<Shift2Stock> GetStock_Shift2(String material);


}
