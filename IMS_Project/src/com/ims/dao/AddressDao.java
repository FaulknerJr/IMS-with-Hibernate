package com.ims.dao;

import java.util.List;

import com.ims.entities.Address;

public interface AddressDao {
	
	public Address getAddressById(int id);
	public List<Address> getAllAddresses();
	public List<Address> getAddressByCity(String city);
	public List<Address> getAddressByState(String state);
	public List<Address> getAddressByZip(String zip);
	public boolean updateAddress(Address a);
	public boolean removeAddressById(int id);
	public boolean enterNewAddress(Address a);
	
}
