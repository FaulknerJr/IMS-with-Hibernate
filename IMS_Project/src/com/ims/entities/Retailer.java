package com.ims.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "IMS_SUPPLIER")
public class Retailer {

	@Id
	@Column(name = "S_ID")
	private int id;
	@Column(name = "S_NAME")
	private String name;
	@Column(name = "S_ADDRESS")
	private int addressID;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAddressID() {
		return addressID;
	}

	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}

}
