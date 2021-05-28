package com.sanket.stockmgr.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Purchase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  pId;
	private String brandName;
	private String volume;
	private double price; 
	
	@ManyToOne(fetch= FetchType.LAZY,  cascade = {CascadeType.ALL})
	@JoinColumn(name="billNo")
	@JsonIgnore
	private Bill  billNo;
	
	public Purchase() {
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@JsonIgnore
	public Bill getBillNo() {
		return billNo;
	}
	@JsonProperty
	public void setBillNo(Bill singleBill) {
		this.billNo = singleBill;
	}

	
	
	
}
