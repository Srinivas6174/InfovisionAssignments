package com.training.StockMarket;

import java.util.*;

public class Trader implements Tradeable, Runnable {
    private String traderId;
    private String name;
    private Map<String, Integer> portfolio;
    private Market market;

    public Trader(String traderId, String name, Market market) {
        this.traderId = traderId;
        this.name = name;
        this.portfolio = new HashMap<>();
        this.market = market;
    }

   

    @Override
    public void run() {
        try {
            if (name.equals("Sri")) {
                buystock("SB",10);
                buystock("INFY",8);
                sellstock("P3S",5);
                
            } else if (name.equals("Jai")) {
            	 buystock("SB",7);
                 sellstock("P3S",5);
                 buystock("INFY",8);
            } else if (name.equals("Vignesg")) {
            	 buystock("SB",3);
                 sellstock("P3S",5);
                 buystock("INFY",8);
            }
        } catch (Exception e) {
            System.out.println(name + " Error: " + e.getMessage());
        }
    }


    public void printPortfolio() {
        System.out.println("Trader " + name + "'s Portfolio:");
        for (Map.Entry<String, Integer> entry : portfolio.entrySet()) {
            System.out.println("Stock: " + entry.getKey() + ", Shares: " + entry.getValue());
        }

        

	
	}

	@Override
	public void buystock(String stockId, int quantity) throws Exception {
		Stock stock=market.getStock(stockId);
        try {
            if(stockId != null) {
            	portfolio.put(stockId,1);
            	
            	System.out.println(name + " bought stock: " + stockId + " - " + stock.getStockName());
            	
            }
        } catch (Exception e) {
           System.out.println(e.getMessage());
           System.out.println(name + " attempted to buy unauthorized stock: " + stockId + " - " + stock.getStockName());
        }
		
	}

	@Override
	public void sellstock(String stockId, int quantity) throws Exception {
		try {
            if (!portfolio.containsKey(stockId)) {
                throw new InsufficientSharesException("Trader does not own this stock.");
            }

            market.processSell(stockId);
             
            System.out.println(name + " sold stock: " + stockId);
        } catch (Exception e) {
            System.out.println("Error selling: " + e.getMessage());
        }
	}


	
}
