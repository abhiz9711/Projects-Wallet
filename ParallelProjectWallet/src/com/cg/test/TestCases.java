package com.cg.test;

import org.junit.Assert;
import org.junit.Test;

import com.cg.exception.InvalidException;
import com.cg.service.WalletService;
import com.cg.service.WalletServiceImpl;

public class TestCases {
	@Test
	public void testValidateName() {
		WalletService s = new WalletServiceImpl();
		Assert.assertEquals(true, s.validateName("Abhishek"));
	}

	@Test(expected=InvalidException.class)
	public void testValidateName1() {
		WalletService s = new WalletServiceImpl();
		s.validateName("abhi");
	}
	

	@Test
	public void testValidateNumber1() {
		WalletService s = new WalletServiceImpl();
		Assert.assertEquals(true, s.validateNumber("9452154646"));

	}

	@Test
	public void testValidateNumber2() {
		WalletService s = new WalletServiceImpl();
		Assert.assertEquals(true,s.validateNumber("7010546871"));
	}
	@Test(expected=InvalidException.class)
	public void testValidateNumber3() {
		WalletService s = new WalletServiceImpl();
		s.validateNumber(" ");
	}

	@Test
	public void testValidateBalance1() {
		WalletService s = new WalletServiceImpl();
		Assert.assertEquals(true, s.validateBalance(1000));
	}

	@Test
	public void testValidateBalance2() {
		WalletService s = new WalletServiceImpl();
		Assert.assertEquals(true, s.validateBalance(100));
	}

	
}
