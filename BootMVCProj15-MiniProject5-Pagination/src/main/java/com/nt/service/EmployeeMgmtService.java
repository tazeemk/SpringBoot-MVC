package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.IEmployeeSort;
import com.nt.repository.IEmployeeepo;

@Service
public class EmployeeMgmtService implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeepo empRepo;
	
	@Autowired
	private IEmployeeSort sort;
	@Override
	public List<Employee> showAllEmployee() {
           return empRepo.findAll();
		           
	}

	@Override
	public String addEmployeeRecords(Employee emp) 
	{
		int idVal=empRepo.save(emp).getEmpno();
		return "Record Inserted With Id No :"+idVal;
	}

	
	
	//===============================================================================
	
	
	@Override
	public Employee changeRecord(int id) {
	              Optional<Employee>it=empRepo.findById(id);
	              if(it.isPresent()) {
	            	  return it.get();
	              }else
		           throw new IllegalArgumentException("Invalid No");
	}

	
	@Override
	public String UpdateEmp(Employee emp) 
	{
		   Optional<Employee>it = empRepo.findById(emp.getEmpno());
		if(it.isPresent()) 
		{
		   empRepo.save(emp);
		   return "Employee Is Successfully Updated with id :"+emp.getEmpno();
		}else
		return "Invalid Data";
	}
	
	
	
	
	
	
	//====================================================================================
	
	@Override
	public String removeRecord(int id) {
		 
		   empRepo.deleteById(id);
		return "Record Successfully Deleted :";
	}

	
	//==========================================================
	
	
	@Override
	public List<Employee> searchEmp(String name) {
		
		return empRepo.findByename(name);
	}

	
	
	
	
	@Override
	public Page<Employee> getEmployeeDateByPage(Pageable pageable) {
	    
		return sort.findAll(pageable);
	}
	
	
	
	
}
