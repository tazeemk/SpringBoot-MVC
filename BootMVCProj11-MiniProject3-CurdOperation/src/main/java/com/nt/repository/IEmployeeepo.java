package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Employee;

public interface IEmployeeepo extends JpaRepository<Employee, Integer> 
{

	
	public List<Employee> findByename(String name);
}
