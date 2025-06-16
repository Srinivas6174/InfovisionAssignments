package com.training.StockMarket;

public interface Tradeable {
	
	public void buystock(String stockId, int quantity) throws Exception;
	
	public void sellstock(String stockId, int quantity) throws Exception;

}
