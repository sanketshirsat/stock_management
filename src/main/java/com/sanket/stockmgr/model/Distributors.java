package com.sanket.stockmgr.model;

import java.util.*;

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
public class Distributors {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="dist_Id")
	private int distId;
	private String distributorName;
	private String city;
	private long contactNumber;
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name="distributor_brand",
	joinColumns = {@JoinColumn(name="dist_Id")},
	inverseJoinColumns = {@JoinColumn(name="branch_Id")}
	)
	@JsonIgnore
	private Set<Brand> brands = new HashSet<>();
	
	@JsonIgnore
	public Set<Brand> getBrands() {
		return brands;
	}
	@JsonProperty
	public void setBrands(Set<Brand> brands) {
		this.brands = brands;
	}
	public Distributors() {
		// TODO Auto-generated constructor stub
	}
	public int getDistId() {
		return distId;
	}
	public void setDistId(int distId) {
		this.distId = distId;
	}
	public String getDistributorName() {
		return distributorName;
	}
	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	@Override
	public String toString() {
		return "Distributors [distId=" + distId + ", distributorName=" + distributorName + ", city=" + city
				+ ", contactNumber=" + contactNumber + ", brands=" + brands + "]";
	}
	public Distributors(int distId, String distributorName, String city, long contactNumber) {
	
		this.distId = distId;
		this.distributorName = distributorName;
		this.city = city;
		this.contactNumber = contactNumber;
		this.brands = brands;
	}
	
	
}
