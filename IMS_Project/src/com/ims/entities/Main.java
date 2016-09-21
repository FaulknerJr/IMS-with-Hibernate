package com.ims.entities;

import java.util.List;

import com.ims.dao.AddressDao;
import com.ims.impl.AddressDaoImpl;

public class Main {

	public static void main(String[] args) {
		AddressDao adao = new AddressDaoImpl();
		Address a = new Address();
		a.setStreet("4321 Ekaf Steerts");
		a.setCity("New City");
		a.setState("ThisState");
		a.setZip("12345");
		adao.enterNewAddress(a);
		
		
		List<Address> adds = adao.getAllAddresses();
		for(Address add : adds){
			System.out.println(add.toString());
		}
	}

}
