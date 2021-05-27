package com.sanket.stockmgr.model;

public class Quantity {

	private int  qId;
	private String brandName;
	private String volume;
	public Quantity() {
		super();
	}
	public int getqId() {
		return qId;
	}
	public void setqId(int qId) {
		this.qId = qId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	@Override
	public String toString() {
		return "Quantity [qId=" + qId + ", brandName=" + brandName + ", volume=" + volume + "]";
	}
	
}
