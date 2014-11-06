package com.empters.models.stock.dao;

import com.empters.models.stock.model.Stock;

public interface StockDao {
	void save(Stock stock);

	void update(Stock stock);

	void delete(Stock stock);

	Stock findByStockCode(String stockCode);
}
