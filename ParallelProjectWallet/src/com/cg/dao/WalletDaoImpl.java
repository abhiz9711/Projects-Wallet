package com.cg.dao;

import java.util.HashMap;

import com.cg.beans.Customer;

//import com.cg.mypaymentapp.pl.Datastore;

public class WalletDaoImpl implements WalletDao {
	HashMap<String, Customer> m;

	public WalletDaoImpl() {
		// TODO Auto-generated constructor stub
		m = StoreColl.createColletion();
	}

	
	@Override
	public Customer findOne(String mobileNo) {
		// TODO Auto-generated method stub
		return m.get(mobileNo);
	}
	@Override
	public boolean save(Customer customer) {
		// TODO Auto-generated method stub
		m.put(customer.getMobileNo(), customer);
		return true;
	}


	@Override
	public Customer createAccount(String name, String mobileno, double amount) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Customer showBalance(String mobileno) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Customer fundTransfer(String sourceMobileNo, String targetMobileNo,
			double amount) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Customer depositAmount(String mobileNo, double amount) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Customer withdrawAmount(String mobileNo, double amount) {
		// TODO Auto-generated method stub
		return null;
	}

}
