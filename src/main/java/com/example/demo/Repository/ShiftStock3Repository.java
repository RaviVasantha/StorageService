package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import com.example.demo.Entity.Shift3Stock;

public interface ShiftStock3Repository extends JpaRepository<Shift3Stock, Integer> {
	@Procedure
	public void AddStock_Shift3(String material,int quantity);
	@Procedure
	List<Shift3Stock> GetStock_Shift3(String material);

}
