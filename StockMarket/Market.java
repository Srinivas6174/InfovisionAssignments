package com.training.StockMarket;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Market {
	
	
Map<String,Stock> stock=new HashMap<>();

Set<Integer> registeredTraders=new HashSet<>();

	public void registeredTraders(int tradeId) {
		
		if(registeredTraders.add(tradeId)) {
			System.out.println("TraderId registered Successfully"+" "+tradeId);
			}else {
				System.out.println("TraderId already registered");
			}
	}
	
	public void addStock(Stock StockId) {
		stock.put(StockId.getStockId(),StockId);
		
	}
	
	public synchronized  Stock getStock(String StockId) throws StockNotFoundException {
		if(StockId != null) {
			
			
			System.out.println("Stock are avaiable for :"+StockId);
		}else {
			System.out.println("Stock not found :"+StockId);
		}
		return stock.get(StockId);
	}
	
	public synchronized void buyingProcess(String StockId,int quantity) throws InsufficientMarketSharesException, 
	StockNotFoundException {
		 Stock stock = getStock(StockId);
	        if (stock.getAvailableShare() < quantity) {
	        	System.out.println("Not enough shares in market.");
	       
	        }else {
	        	System.out.println("Found");
	        }
	        
		
	}
	public synchronized  void processSell(String stockId) throws Exception {
        Stock stock = getStock(stockId);
        
    }

}
