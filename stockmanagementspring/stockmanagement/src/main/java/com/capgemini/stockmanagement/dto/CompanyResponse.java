package com.capgemini.stockmanagement.dto;

import java.util.List;

import lombok.Data;

@Data
public class CompanyResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<Company> company;

}
