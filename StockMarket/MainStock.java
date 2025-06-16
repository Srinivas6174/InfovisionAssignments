package com.training.StockMarket;

public class MainStock {
	public static void main(String[] args) {
	    Market market = new Market();
        market.addStock(new Stock("SB", "StarBucks.", 150.0, 10));
        market.addStock(new Stock("P3S", "Platform3solution", 700.0, 5));
        market.addStock(new Stock("INFY", "Infosys Ltd.", 1200.0, 8));
 
        Trader T1 = new Trader("T001", "Sri", market);
        Trader T2 = new Trader("T002", "Jai", market);
        Trader T3 = new Trader("T003", "Vignesg", market);
 
        Thread t1 = new Thread(T1);
        Thread t2 = new Thread(T2);
        Thread t3 = new Thread(T3);
 
        t1.start();
        t2.start();
        t3.start();
 
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
 
        T1.printPortfolio();
        T2.printPortfolio();
        T3.printPortfolio();
    }

}
