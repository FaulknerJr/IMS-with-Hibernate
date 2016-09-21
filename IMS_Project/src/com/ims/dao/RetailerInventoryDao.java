package com.ims.dao;

import java.util.List;

import com.ims.entities.RetailerInventory;

public interface RetailerInventoryDao {

	public RetailerInventory getRetailInventoryById(int id);
	public List<RetailerInventory> getAllRetailInventory();
	public List<RetailerInventory> getRetailInventoryByProduct(String product);
	public List<RetailerInventory> getRetailInventoryByQuality(String quality);
	public boolean createNewRetailInventory(RetailerInventory inv);
	public boolean updateRetailInventory(int id, RetailerInventory inv);
	public boolean removeRetailInventoryById(int id);
	
}
