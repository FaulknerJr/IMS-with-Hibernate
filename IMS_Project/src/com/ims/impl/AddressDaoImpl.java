package com.ims.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ims.dao.AddressDao;
import com.ims.entities.Address;
import com.ims.util.ConnectionUtil;

public class AddressDaoImpl implements AddressDao {
	
	private SessionFactory factory = null;
	
	@Override
	public Address getAddressById(int id) {
		Session session = ConnectionUtil.getSession();
		
		Address a = (Address) session.load(Address.class, id);
		a.getCity();

		session.close();
		return a;
	}

	@Override
	public List<Address> getAllAddresses() {
		Session session = ConnectionUtil.getSession();
		List<Address> adds = session.createCriteria(Address.class).list();
		session.close();
		return adds;
	}

	@Override
	public List<Address> getAddressByCity(String city) {
		Session session = ConnectionUtil.getSession();
		List<Address> adds = session.createCriteria(Address.class).list();
		List<Address> addsCity = new ArrayList<>();
		if (adds != null) {
			for (int i = 0; i < adds.size(); ++i) {
				if (adds.get(i).getCity().equals(city)) {
					addsCity.add(adds.get(i));
				}
			}
		}
		session.close();
		return addsCity;
	}

	@Override
	public List<Address> getAddressByState(String state) {
		Session session = ConnectionUtil.getSession();
		List<Address> adds = session.createCriteria(Address.class).list();
		List<Address> addsState = new ArrayList<>();
		if (adds != null) {
			for (int i = 0; i < adds.size(); ++i) {
				if (adds.get(i).getCity().equals(state)) {
					addsState.add(adds.get(i));
				}
			}
		}
		session.close();
		return addsState;
	}

	@Override
	public List<Address> getAddressByZip(String zip) {
		Session session = ConnectionUtil.getSession();
		List<Address> adds = session.createCriteria(Address.class).list();
		List<Address> addsZip = new ArrayList<>();
		if (adds != null) {
			for (int i = 0; i < adds.size(); ++i) {
				if (adds.get(i).getCity().equals(zip)) {
					addsZip.add(adds.get(i));
				}
			}
		}
		session.close();
		return addsZip;
	}

	@Override
	public boolean updateAddress(Address a) {
		Session s = ConnectionUtil.getSession();
		s.update(a); 
		System.out.println("Address up to date.");
		s.close();
		return true;
	}

	@Override
	public boolean removeAddressById(int id) {
		Session session = ConnectionUtil.getSession();
		Query q = session.createQuery("DELETE FROM ims_address WHERE A_ID= :id");
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
	public boolean enterNewAddress(Address a) {
		Session s = ConnectionUtil.getSession();
		Transaction tx = null;
		try{
			
			tx = s.beginTransaction();
			int id = (Integer)s.save(a);
			tx.commit();
			
			return id > 0;
		}catch(HibernateException e){
			System.out.println("Null entered into non-null field");
			System.out.println(e.getMessage());
			if(tx != null){
				tx.rollback();
			}
			return false;
		} finally{
			s.close();
		}
	}

}
