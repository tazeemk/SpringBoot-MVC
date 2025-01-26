package com.nt.service;

import com.nt.document.Employee1;

public interface IEmployeeServiceRepo {

	public String checkCrenditials(String uname,String pword);
	
	public String addEmployee(Employee1 emp);
	
}
