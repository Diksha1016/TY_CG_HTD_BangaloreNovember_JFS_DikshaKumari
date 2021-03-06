package com.capgemini.stockmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.stockmanagement.dao.CompanyDAO;
import com.capgemini.stockmanagement.dao.StockDAO;
import com.capgemini.stockmanagement.dto.Stock;
import com.capgemini.stockmanagement.exception.ValidationException;
import com.capgemini.stockmanagement.util.Validation;

@Service
public class StockServiceImpl implements StockService {
	@Autowired
	StockDAO dao;
	@Autowired
	CompanyDAO companyDao;
	@Override
	public boolean addStock(Stock stock) {
		Validation v = new Validation();
		String companyId = stock.getCompanyId();
		if(v.companyIdValidation(companyId)) {
			stock.setCompanyId(companyId);
		}
		else {
			throw new ValidationException("Enter id in this format (example :TS-01)");
		}
		 if(companyDao.getCompany(stock.getCompanyId()) != null){
			 return dao.addStock(stock);
		 }else {
		   throw new ValidationException("This id doesn't exists");
	     }
	}

	@Override
	public boolean deleteStock(int stockId) {
		return dao.deleteStock(stockId);
	}

	@Override
	public boolean updateStock(int stockId, Stock stock) {
		Validation v = new Validation();
		String companyId = stock.getCompanyId();
		if(v.companyIdValidation(companyId)) {
			stock.setCompanyId(companyId);
		}
		else {
			throw new ValidationException("Enter id in this format (example :TS-01)");
		}
		return dao.updateStock(stockId, stock);
	}

	@Override
	public List<Stock> getAllStocks() {
		return dao.getAllStocks();
	}

	@Override
	public Stock searchStock(int stockId) {
		return dao.searchStock(stockId);
	}
}
