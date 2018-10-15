package com.teju.project.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name="Billingdata")
public class Billing 
{
	@Id
	private String billingid;
	@Column
	private String street;
	@Column
	private String city;
	@Column
	private String state;
	@Column
    private String country;
	@Column
    private String zipcode;
    @Transient
    private String productid;
	public String getBillingid() {
		return billingid;
	}
	public void setBillingid(String billingid) {
		this.billingid = billingid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
}
