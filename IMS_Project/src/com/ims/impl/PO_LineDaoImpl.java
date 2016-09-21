package com.ims.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.ims.dao.PO_LineDao;
import com.ims.entities.Address;
import com.ims.entities.PO_Line;
import com.ims.util.ConnectionUtil;

public class PO_LineDaoImpl implements PO_LineDao{

	@Override
	public PO_Line getPOLineById(int id) {
		Session s = ConnectionUtil.getSession();
		PO_Line pol = (PO_Line)s.load(PO_Line.class, id);
		pol.getClass();
		s.close();
		return pol;
	}

	@Override
	public List<PO_Line> getPOLineByOrder(int po) {
		Session session = ConnectionUtil.getSession();
		List<PO_Line> allPOL = session.createCriteria(Address.class).list();
		List<PO_Line> POLOrder = new ArrayList<>();
		if (allPOL != null) {
			for (int i = 0; i < allPOL.size(); ++i) {
				if (allPOL.get(i).getProduct_order() == po) {
					POLOrder.add(allPOL.get(i));
				}
			}
		}
		return POLOrder;
	}

	@Override
	public List<PO_Line> getPOLineByQuantity(int q) {
		Session session = ConnectionUtil.getSession();
		List<PO_Line> allPOL = session.createCriteria(Address.class).list();
		List<PO_Line> POLquan = new ArrayList<>();
		if (allPOL != null) {
			for (int i = 0; i < allPOL.size(); ++i) {
				if (allPOL.get(i).getQuantity() == q) {
					POLquan.add(allPOL.get(i));
				}
			}
		}
		return POLquan;
	}

	@Override
	public List<PO_Line> getPOLineByCost(int cost) {
		Session session = ConnectionUtil.getSession();
		List<PO_Line> allPOL = session.createCriteria(Address.class).list();
		List<PO_Line> POLCost = new ArrayList<>();
		if (allPOL != null) {
			for (int i = 0; i < allPOL.size(); ++i) {
				if (allPOL.get(i).getCost() == cost) {
					POLCost.add(allPOL.get(i));
				}
			}
		}
		return POLCost;
	}

	@Override
	public List<PO_Line> getAllPOLines() {
		Session session = ConnectionUtil.getSession();
		List<PO_Line> allPOL = session.createCriteria(Address.class).list();
		session.close();
		return allPOL;
	}

	@Override
	public boolean removePOLineById(int id) {
		Session session = ConnectionUtil.getSession();
		Query q = session.createQuery("DELETE FROM ims_po_line WHERE A_ID= :id");
		q.setParameter("id", new Integer(id));
		int res = q.executeUpdate();
		session.close();
		if(res > 0){
			return true;
		}
		return false;
	}

	@Override
	public boolean addNewPOLine(PO_Line po) {
		Session s = ConnectionUtil.getSession();
		try{
			s.save(po);
			System.out.println("Product Order has been entered");
			return true;
		}catch(Exception e){
			System.out.println("Null entered into non-null field");
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean removePOLineByCost(int cost) {
		Session session = ConnectionUtil.getSession();
		Query q = session.createQuery("DELETE FROM ims_po_line WHERE POL_COST= :cost");
		q.setParameter("cost", new Integer(cost));
		int res = q.executeUpdate();
		session.close();
		if(res > 0){
			return true;
		}
		return false;
	}

	@Override
	public boolean updatePOLineQuantity(PO_Line po) {
		Session s = ConnectionUtil.getSession();
		s.saveOrUpdate(po); 
		System.out.println("Product Order Line up to date.");
		s.close();
		return true;
	}

}
