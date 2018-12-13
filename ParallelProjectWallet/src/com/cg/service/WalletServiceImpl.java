package com.cg.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.beans.Customer;
import com.cg.beans.Wallet;
import com.cg.dao.WalletDao;
import com.cg.dao.WalletDaoImpl;
import com.cg.exception.InvalidException;

public class WalletServiceImpl implements WalletService {
	WalletDao dao=new WalletDaoImpl();


	@Override
	public Customer createAccount(String name, String mobileno, double amount) {
		// TODO Auto-generated method stub
		Customer c1 = dao.findOne(mobileno);
		if (c1 == null) {
			Wallet w = new Wallet(amount);
			Customer c = new Customer(name, mobileno, w);
			if (dao.save(c))
				return c;
			else
				throw new InvalidException("Invalid");
		} else
			throw new InvalidException("Number already Exists");
	}

	@Override
	public Customer showBalance(String mobileno) {
		// TODO Auto-generated method stub
		Customer c = dao.findOne(mobileno);
		if (c != null)
			return c;
		else
			throw new InvalidException(
					"The number does not exist Please enter a valid registered mobile number");
	}

	@Override
	public Customer fundTransfer(String sourceMobileNo, String targetMobileNo,
			double amount) {
		Customer c = dao.findOne(sourceMobileNo);
		Customer c1 = dao.findOne(targetMobileNo);
		if (amount <= 0)
			throw new InvalidException(
					"Please enter amount more than 0. Amount cannot be less than or equal to zero");
		if (c == null)
			throw new InvalidException(
					"Sender Number not found Please enter registered mobile number");
		if (c1 == null)
			throw new InvalidException("Reciever Number not registered");
		if (c != null && c1 != null) {
			withdrawAmount(sourceMobileNo, amount);
			depositAmount(targetMobileNo, amount);
			return c;
		} else
			throw new InvalidException("Transfer failed");
		// TODO Auto-generated method stub
	}

	@Override
	public Customer depositAmount(String mobileNo, double amount) {
		// TODO Auto-generated method stub
		
		Customer cu = dao.findOne(mobileNo);
		if (amount <= 0)
			throw new InvalidException(
					"Please enter amount more than 0 amount cannot be less than or equal to zero");
		if (cu != null) {
			cu.getWallet().setBalance(cu.getWallet().getBalance()+(amount));
			dao.save(cu);
			return cu;
		}
		throw new InvalidException(
				"Number not found Please enter registered mobile number");
	}

	@Override
	public Customer withdrawAmount(String mobileNo, double amount) {
		// TODO Auto-generated method stub
	
		Customer cu = dao.findOne(mobileNo);
		if (cu == null)
			throw new InvalidException(
					"Number not found Please enter a valid registered mobile number");

		if (cu.getWallet().getBalance() >= 100) {
			cu.getWallet().setBalance(cu.getWallet().getBalance()-(amount));
			dao.save(cu);
			return cu;
		} else
			throw new InvalidException(
					"Insufficient Balance in  your account cannot deduct money because we need to maintain minimum of 100 balance");
	}

	@Override
	public boolean validateName(String name) throws InvalidException {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("[A-Z][a-z]{0,19}");
		Matcher m = p.matcher(name);
		if (m.matches())
			return true;
		else
			throw new InvalidException(
					"Name is invalid first letter capital and other as small letter and maximum of 20 characters long ");
	}

	@Override
	public boolean validateNumber(String number) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("[6-9][0-9]{9}");
		Matcher m = p.matcher(number);
		if (m.matches())
			return true;
		else
			throw new InvalidException(
					"Number is not correct please enter 10 digit number");
	}

	@Override
	public boolean validateBalance(double number) {
		// TODO Auto-generated method stub
		if (number >= 100)
			return true;
		else
			throw new InvalidException(
					"Amount is less than 100...Deposit minimum 101 to create account");
	}

	@Override
	public boolean isNewMobile(String mob) 
	{
		Customer c1 = dao.findOne(mob);
		if (c1 == null)
			return false;
		else
			throw new InvalidException("Number already exists");
	}

	@Override
	public boolean isAvailableMobile(String mob) {
		Customer c1 = dao.findOne(mob);
		if (c1 != null)
			return false;
		else
			throw new InvalidException("Number not found");
	}

}
