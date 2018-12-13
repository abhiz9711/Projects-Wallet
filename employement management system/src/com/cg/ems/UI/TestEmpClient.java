package com.cg.ems.UI;

import java.util.Scanner;

import com.cg.ems.Service.EmployeeService;
import com.cg.ems.service.EmployeeServiceImp;

public class TestEmpClient {
static Scanner sc = null;
static EmployeeService empSer=null;
public static void main(String[] args) 
{
	sc=new Scanner(System.in);
	empSer=new EmployeeServiceImp();
	int choice=0;
	while(true)
	{
		System.out.println("what do u want to do?");
		System.out.println("1.add emp\t2:Fetch All Emp\n");
		System.out.println("3.Delete emp\t4:Search emp by id \n");
		System.out.println("5.search emp by name\t6:Update\n");
		System.out.println("7.Exit\n");
		System.out.println("Enter ur choice");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:addEmp();break;
		case 2:showEmpInfo();break;
		case 3:deleteEmp();break;
        case 4: searchById(); break;
        case 5:searchByName();break;
		default:System.exit(0);
		}
		
	}
}
private static void searchByName() {
	// TODO Auto-generated method stub
	
}
private static void searchById() {
	// TODO Auto-generated method stub
	
}
private static void deleteEmp() {
	// TODO Auto-generated method stub
	
}
private static void showEmpInfo() {
	// TODO Auto-generated method stub
	
}
private static void addEmp() {
	// TODO Auto-generated method stub
	
}
}

}
