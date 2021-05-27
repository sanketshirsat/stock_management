package com.sanket.stockmgr.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Brand {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="brand_Id")
	private int brandId;
	private String brandName;
	private int distributor;
	boolean active;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL})
	@JoinTable(name="distributor_brand",
	joinColumns = {@JoinColumn(name="branch_Id")},
	inverseJoinColumns = {@JoinColumn(name="dist_Id")}
	)
	@JsonIgnore
	private Set<Distributors> distributors  = new HashSet<>();
	
	public Brand() {
	}

	@JsonIgnore
	public Set<Distributors> getDistributors() {
		return distributors;
	}
	@JsonProperty
	public void setDistributors(Set<Distributors> distributors) {
		this.distributors = distributors;
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

	public Brand(int brandId, String brandName, int distributor, boolean active, Set<Distributors> distributors) {
		this.brandId = brandId;
		this.brandName = brandName;
		this.distributor = distributor;
		this.active = active;
		this.distributors = distributors;
	} 
	
	
	
	
}
