package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Emp;

public interface IEmployeeRepo extends JpaRepository<Emp, Integer>
{

	
	
}
