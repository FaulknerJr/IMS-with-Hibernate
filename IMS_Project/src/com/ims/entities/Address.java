package com.ims.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="IMS_ADDRESS")
public class Address {
	
	@Column(name="A_STREET")
	private String street;
	@Column(name="A_CITY")
	private String city;
	@Column(name="A_STATE")
	private String state;
	@Column(name="A_ZIP")
	private String zip;
	@Id
	@Column(name="A_ID")
	private int id;
	
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
