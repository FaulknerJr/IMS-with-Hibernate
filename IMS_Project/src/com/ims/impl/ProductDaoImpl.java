package com.ims.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.ims.dao.ProductDao;
import com.ims.entities.Address;
import com.ims.entities.Product;
import com.ims.util.ConnectionUtil;

public class ProductDaoImpl implements ProductDao {

	@Override
	public Product getProductById(int id) {
		Session session = ConnectionUtil.getSession();
		Product p = (Product) session.load(Product.class, id);
		p.getName();
		
		session.close();
		return p;
	}

	@Override
	public List<Product> getAllProducts() {
		Session session = ConnectionUtil.getSession();
		List<Product> prods = session.createCriteria(Address.class).list();
		session.close();
		return prods;
	}

	@Override
	public List<Product> getProductsByName(String name) {
		Session session = ConnectionUtil.getSession();
		List<Product> prods = session.createCriteria(Address.class).list();
		List<Product> prodsName = new ArrayList<>();
		if (prods != null) {
			for (int i = 0; i < prods.size(); ++i) {
				if (prods.get(i).getName().equals(name)) {
					prodsName.add(prods.get(i));
				}
			}
		}
		session.close();
		return prodsName;
	}

	@Override
	public List<Product> getProductsBySupplyPrice(String sp) {
		Session session = ConnectionUtil.getSession();
		List<Product> prods = session.createCriteria(Address.class).list();
		List<Product> prodsSPrice = new ArrayList<>();
		if (prods != null) {
			for (int i = 0; i < prods.size(); ++i) {
				if (prods.get(i).getName().equals(sp)) {
					prodsSPrice.add(prods.get(i));
				}
			}
		}
		session.close();
		return prodsSPrice;
	}

	@Override
	public List<Product> getProductsByRetailPrice(String rp) {
		Session session = ConnectionUtil.getSession();
		List<Product> prods = session.createCriteria(Address.class).list();
		List<Product> prodsRPrice = new ArrayList<>();
		if (prods != null) {
			for (int i = 0; i < prods.size(); ++i) {
				if (prods.get(i).getName().equals(rp)) {
					prodsRPrice.add(prods.get(i));
				}
			}
		}
		session.close();
		return prodsRPrice;
	}

	@Override
	public boolean addNewProduct(Product p) {
		Session s = ConnectionUtil.getSession();
		try{
			s.save(p);
			System.out.println("Product has been entered");
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
	public boolean updateProduct(Product p) {
		Session s = ConnectionUtil.getSession();
		s.update(p);
		System.out.println("Product up to date.");
		s.close();
		return true;
	}

	@Override
	public boolean removeProductById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeProductByName(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeProductBySupplyPrice(String sp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeProductByRetailPrice(String rp) {
		// TODO Auto-generated method stub
		return false;
	}

}
