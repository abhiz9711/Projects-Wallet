package com.cg.ems.Util;

import java.util.HashSet;

import om.cg.ems.DTO.Employee;

public class CollectionUtil {
	private static HashSet<Employee> empSet=new HashSet<Employee>();
	static
	{
		empSet.add(new Employee(112081,"Vaishali S",50000.0F));
		empSet.add(new Employee(160062,"Abhi ",88000.0F));
		empSet.add(new Employee(112685,"Ravi ",56000.0F));
		empSet.add(new Employee(175622,"Kiran S",60000.0F));
		empSet.add(new Employee(114561,"Mahesh ",40000.0F));
	}
	public static void  addEmployee(Employee emp){
		empSet.add(emp);
	}

}
