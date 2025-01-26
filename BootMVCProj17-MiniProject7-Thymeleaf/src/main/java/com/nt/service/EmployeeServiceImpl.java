package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Employee1;
import com.nt.repository.IEmployeeRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;
@Service
public class EmployeeServiceImpl implements IEmployeeServiceRepo {

	@Autowired
	private IEmployeeRepo empRepo;
	
	@Autowired
	private EntityManager manager;
	
	
	@Override
	public String checkCrenditials(String uname, String pword) {

		StoredProcedureQuery query = manager.createStoredProcedureQuery("P_LOFIN_DETAIL");
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
		query.setParameter(1, uname);  query.setParameter(2, pword);
		
		String msg =(String)query.getOutputParameterValue(3);
		return msg;
	}

	
	
	
	@Override
	public String addEmployee(Employee1 emp) {
		 String msg= empRepo.save(emp).getEmpno();
		 
		return "Employee Added Successfully with id No :"+msg;
	}






	
}
