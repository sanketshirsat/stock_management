package com.sanket.stockmgr.model;

public class Stock {

	private int stockId;
	private int brand;
	private double sellingPrice;
	private int quantity;
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public int getBrand() {
		return brand;
	}
	public void setBrand(int brand) {
		this.brand = brand;
	}
	public double getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", brand=" + brand + ", sellingPrice=" + sellingPrice + ", quantity="
				+ quantity + "]";
	}
	
	
}
