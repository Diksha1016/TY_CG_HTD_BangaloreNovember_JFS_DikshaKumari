    
package com.capgemini.stockmanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "stocks_info")
public class Stock {
	@Id
	@Column
	@GeneratedValue
	private int stockId;
	@Column(nullable=false)
	private int price;
	@Column(nullable=false)
	private int stockQuantity;
	@Column(nullable=false)
	private String companyId;
}