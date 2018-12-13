package com.cg.ems.DAO;

import java.util.HashSet;

import om.cg.ems.DTO.Employee;

import com.cg.ems.Exception.EmployeeException;
import com.cg.ems.Util.CollectionUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public int addEmployee(Employee emp) throws EmployeeException {
		CollectionUtil.addEmployee(emp);
		return emp.getEmpId();
	}

	@Override
	public HashSet<Employee> fetchAllEmp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmpById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<Employee> searchEmpBYName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteEmp(int empId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee updateEmp(int empId, String newName, float newSal) {
		// TODO Auto-generated method stub
		return null;
	}

}
