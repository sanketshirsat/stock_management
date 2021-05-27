package com.sanket.stockmgr.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Brand {

	@Id
	private int brandId;
	private String brandName;
	private int distributor;
	boolean active;
	
	public Brand() {
		super();
	}
	
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getDistributor() {
		return distributor;
	}
	public void setDistributor(int distributor) {
		this.distributor = distributor;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "Brand [brandId=" + brandId + ", brandName=" + brandName + ", distributor=" + distributor + ", active="
				+ active + "]";
	} 
	
	
	
	
}
