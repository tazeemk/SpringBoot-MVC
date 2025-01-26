package com.nt.service;

import java.util.List;

import com.nt.entity.Employee;

public interface IEmployeeMgmtService 
{

	public List<Employee> showAllEmployee();
	
	public String addEmployeeRecords(Employee emp);
	
	public Employee changeRecord(int id);
	
	public String UpdateEmp(Employee emp);
	
	public String removeRecord(int id);
	
	public List<Employee>searchEmp(String name);
	
	
	 public List<Employee>dynamicEmployee(Integer dept1,Integer dept2,Integer dept3,Employee emp);
}
