package com.cg.ems.Service;

import java.util.HashSet;

import om.cg.ems.DTO.Employee;

import com.cg.ems.Exception.EmployeeException;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public int addEmployee(Employee ee) throws EmployeeException {
		// TODO Auto-generated method stub
		return 0;
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

	@Override
	public boolean validateDigit(int num) throws EmployeeException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateName(String name) throws EmployeeException {
		// TODO Auto-generated method stub
		return false;
	}

}
