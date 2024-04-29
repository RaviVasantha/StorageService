package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="Shift2stock")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Shift2Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String material;
	private double quantity;


}
