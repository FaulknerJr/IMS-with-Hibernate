package com.ims.entities;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * Product Order Line
 * 
 * @author Jeffrey
 *
 */
public class PO_Line {
	@Id
	@Column(name="POL_ID")
	private int id;
	@Column(name="POL_PO")
	private int product_order;
	@Column(name="POL_QUANTITY")
	private int quantity;
	@Column(name="POL_COST")
	private int cost;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProduct_order() {
		return product_order;
	}

	public void setProduct_order(int product_order) {
		this.product_order = product_order;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
