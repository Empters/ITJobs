package com.empters.models.stock.bo;

import org.springframework.transaction.annotation.Transactional;

import com.empters.models.stock.model.Stock;

@Transactional
public interface StockBo {

	void save(Stock stock);

	void update(Stock stock);

	void delete(Stock stock);

	Stock findByStockCode(String stockCode);
}