package com.empters.models.stock.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empters.models.stock.bo.StockBo;
import com.empters.models.stock.dao.StockDao;
import com.empters.models.stock.model.Stock;

@Service("stockBo")
public class StockBoImpl implements StockBo {

	@Autowired
	StockDao stockDao;

	public void setStockDao(StockDao stockDao) {
		this.stockDao = stockDao;
	}

	public void save(Stock stock) {
		System.out.println("SAVE BEEE");
		stockDao.save(stock);
	}

	public void update(Stock stock) {
		stockDao.update(stock);
	}

	public void delete(Stock stock) {
		stockDao.delete(stock);
	}

	public Stock findByStockCode(String stockCode) {
		return stockDao.findByStockCode(stockCode);
	}
}