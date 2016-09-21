package com.ims.dao;

import java.util.List;

import com.ims.entities.PurchaseOrder;

public interface PurchaseOrderDao {

	public PurchaseOrder getPurchaseOrderById(int id);
	public List<PurchaseOrder> getAllPurchaseOrders();
	public List<PurchaseOrder> getAllPurchaseOrdersBySupplier(int supplyId);
	public List<PurchaseOrder> getAllPurchaseOrdersByRetailer(int retailId);
	public List<PurchaseOrder> getAllPurchaseOrdersByCost(int cost);
	public boolean createNewPurchaseOrder(PurchaseOrder p);
	public boolean removePurchaseOrderById(int id);
	public boolean updatePurchaseOrderById(int id, PurchaseOrder p);
	public boolean updatePurchaseOrderByRetailerId(int retailId, PurchaseOrder p);
	public boolean updatePurchaseOrderBySupplierId(int supplyId, PurchaseOrder p);
	
}
