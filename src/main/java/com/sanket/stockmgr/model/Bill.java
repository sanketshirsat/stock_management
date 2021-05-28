package com.sanket.stockmgr.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int billNo;
	private double totalBillAmount ;
	
	@OneToMany( fetch= FetchType.LAZY,  cascade = {CascadeType.ALL})
	@JoinColumn(name="billNo")
	private List<Purchase> purchaseList =  new ArrayList<Purchase>();

	public int getBillNo() {
		return billNo;
	}

	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}

	public double getTotalBillAmount() {
		return totalBillAmount;
	}

	public void setTotalBillAmount(double totalBillAmount) {
		this.totalBillAmount = totalBillAmount;
	}

	public List<Purchase> getPurchaseList() {
		return purchaseList;
	}

	public void setPurchaseList(List<Purchase> purchaseList) {
		this.purchaseList = purchaseList;
	}

	public Bill(int billNo, double totalBillAmount, List<Purchase> purchaseList) {
		super();
		this.billNo = billNo;
		this.totalBillAmount = totalBillAmount;
		this.purchaseList = purchaseList;
	}

	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
