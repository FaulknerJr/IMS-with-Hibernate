package com.ims.dao;

import java.util.List;

import com.ims.entities.Product;

public interface ProductDao {

	public Product getProductById(int id);
	public List<Product> getAllProducts();
	public List<Product> getProductsByName(String name);
	public List<Product> getProductsBySupplyPrice(String sp);
	public List<Product> getProductsByRetailPrice(String rp);
	public boolean addNewProduct(Product p);
	public boolean updateProduct(Product p);
	public boolean removeProductById(int id);
	public boolean removeProductByName(String name);
	public boolean removeProductBySupplyPrice(String sp);
	public boolean removeProductByRetailPrice(String rp);
}
