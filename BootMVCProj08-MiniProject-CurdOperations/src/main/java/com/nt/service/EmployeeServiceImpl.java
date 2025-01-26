package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Emp;
import com.nt.repository.IEmployeeRepo;
@Service
public class EmployeeServiceImpl implements IEmployeeServiceImpl {

	@Autowired
	private IEmployeeRepo serEmp;
	
	@Override
	public List<Emp> getAllDetils() {
	  System.out.println(serEmp.findAll());
		
	      serEmp.findAll().forEach(System.out::println);
		return serEmp.findAll();
	}

}
