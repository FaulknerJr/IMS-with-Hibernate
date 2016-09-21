package com.ims.entities;

public class RetailerInventory {

	private int id;
	private int retailer;
	private String product;
	private String quality;
	private String minAmnt;

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

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getMinAmnt() {
		return minAmnt;
	}

	public void setMinAmnt(String minAmnt) {
		this.minAmnt = minAmnt;
	}

}
