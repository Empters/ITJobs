package com.empters.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.empters.models.stock.bo.StockBo;
import com.empters.models.stock.model.Stock;

@Controller
@RequestMapping("/hello")
public class IndexContoller {
	
	@Autowired
	StockBo stockBo;

	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("message", "Ebane!");

		/** insert **/
		Stock stock = new Stock();
		stock.setStockCode("7668");
		stock.setStockName("HAIO");
		stockBo.save(stock);

		/** select **/
		Stock stock2 = stockBo.findByStockCode("7668");
		System.out.println(stock2);

		/** update **/
		stock2.setStockName("HAIO-1");
		stockBo.update(stock2);

		/** delete **/
		stockBo.delete(stock2);

		System.out.println("Done");
		return "hello";
	}
}
