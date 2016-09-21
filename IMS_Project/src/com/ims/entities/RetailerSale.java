package com.ims.entities;

import java.sql.Date;

public class RetailerSale {

	private int id;
	private int retailer;
	private int productQuantity;
	private int cost;
	private Date timestamp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRetailer() {
		return retailer;
	}

	public void setRetailer(int retailer) {
		this.retailer = retailer;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

}
