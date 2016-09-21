package com.ims.dao;

import java.util.List;

import com.ims.entities.RetailerSale;

public interface RetailerSaleDao {

	public RetailerSale getSaleById(int id);
	public List<RetailerSale> getAllSales();
	public List<RetailerSale> getSaleByRetailId(int retailId);
	public List<RetailerSale> getSaleByCost(int cost);
	public List<RetailerSale> getSaleByQuantity(int quantity);
	public boolean createNewRetailSale(RetailerSale rs);
	public boolean removeRetailSaleById(int id);
	public boolean updateRetailSale(int id, RetailerSale rs);
	
}
