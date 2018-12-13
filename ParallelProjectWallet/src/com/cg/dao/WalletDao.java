package com.cg.dao;

import com.cg.beans.Customer;

public interface WalletDao {

	public Customer createAccount(String name, String mobileno, double amount);

	public Customer showBalance(String mobileno);

	public Customer fundTransfer(String sourceMobileNo, String targetMobileNo,
			double amount);

	public Customer depositAmount(String mobileNo, double amount);

	public Customer withdrawAmount(String mobileNo, double amount);

	public boolean save(Customer customer);

	public Customer findOne(String mobileNo);
}
