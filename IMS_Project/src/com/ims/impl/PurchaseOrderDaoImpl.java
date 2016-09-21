package com.ims.impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.ims.dao.PurchaseOrderDao;
import com.ims.entities.Address;
import com.ims.entities.PurchaseOrder;
import com.ims.util.ConnectionUtil;

public class PurchaseOrderDaoImpl implements PurchaseOrderDao{

	@Override
	public PurchaseOrder getPurchaseOrderById(int id) {
		Session session = ConnectionUtil.getSession();
		PurchaseOrder po = (PurchaseOrder) session.load(PurchaseOrder.class, id);
		po.getCost();

		session.close();
		return po;
	}

	@Override
	public List<PurchaseOrder> getAllPurchaseOrders() {
		Session session = ConnectionUtil.getSession();
		List<PurchaseOrder> pos = session.createCriteria(PurchaseOrder.class).list();
		session.close();
		return pos;
	}

	@Override
	public List<PurchaseOrder> getAllPurchaseOrdersBySupplier(int supplyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PurchaseOrder> getAllPurchaseOrdersByRetailer(int retailId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PurchaseOrder> getAllPurchaseOrdersByCost(int cost) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createNewPurchaseOrder(PurchaseOrder p) {
		Session s = ConnectionUtil.getSession();
		try{
			s.save(p);
			System.out.println("Product Order Created");
			s.close();
			return true;
		} catch(Exception e){
			System.out.println("Null entered into non-null field");
			System.out.println(e.getMessage());
			s.close();
			return false;
		}
	}

	@Override
	public boolean removePurchaseOrderById(int id) {
		Session session = ConnectionUtil.getSession();
		Query q = session.createQuery("DELETE FROM ims_purchase_order WHERE PO_ID= :id");
		q.setParameter("id", new Integer(id));
		int res = q.executeUpdate();
		session.close();
		if(res > 0){
			session.close();
			return true;
		}
		session.close();
		return false;
	}

	@Override
	public boolean updatePurchaseOrderById(int id, PurchaseOrder p) {
		Session s = ConnectionUtil.getSession();
		s.update(p);
		System.out.println("Purchase Order is up to date");
		s.close();
		return true;
	}

	@Override
	public boolean updatePurchaseOrderByRetailerId(int retailId, PurchaseOrder p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePurchaseOrderBySupplierId(int supplyId, PurchaseOrder p) {
		// TODO Auto-generated method stub
		return false;
	}

}
