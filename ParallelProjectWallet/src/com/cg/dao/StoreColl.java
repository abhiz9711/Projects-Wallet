package com.cg.dao;

import java.util.HashMap;

import com.cg.beans.Customer;
import com.cg.beans.Wallet;

public class StoreColl {

	public static HashMap<String, Customer> map;

	public static HashMap<String, Customer> createColletion() {
		if (map == null) {
			map = new HashMap<String, Customer>();
			map.put("9600723475", new Customer("Kiran", "9600723475",
					new Wallet(500)));
		}
		return map;
	}
}
