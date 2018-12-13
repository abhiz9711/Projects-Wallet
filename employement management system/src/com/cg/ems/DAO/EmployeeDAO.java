package com.cg.ems.DAO;

import java.util.HashSet;

import om.cg.ems.DTO.Employee;

import com.cg.ems.Exception.EmployeeException;

public interface EmployeeDAO {
	public int addEmployee(Employee ee)throws EmployeeException;
	public HashSet<Employee> fetchAllEmp();
	public Employee getEmpById(int empId);
	public HashSet<Employee> searchEmpBYName(String name);
	public int deleteEmp(int empId);
	public Employee updateEmp(int empId,String newName,float newSal);

}
