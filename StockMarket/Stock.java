package com.training.StockMarket;

public class Stock {
	
	private String stockId;
	private String stockName;
	private double pricepershare;
	private int availableShare;
	
	
	public Stock(String stockId,String stockName,double pricepershare,int availableShare) {
		this.stockId=stockId;
		this.stockName=stockName;
		this.pricepershare=pricepershare;
		this.availableShare=availableShare;
	}


	public String getStockId() {
		return stockId;
	}


	public void setStockId(String stockId) {
		this.stockId = stockId;
	}


	public String getStockName() {
		return stockName;
	}


	public void setStockName(String stockName) {
		this.stockName = stockName;
	}


	public double getPricepershare() {
		return pricepershare;
	}


	public void setPricepershare(double pricepershare) {
		this.pricepershare = pricepershare;
	}


	public int getAvailableShare() {
		return availableShare;
	}


	public void setAvailableShare(int availableShare) {
		this.availableShare = availableShare;
	}
	
	
	
	
	

}
