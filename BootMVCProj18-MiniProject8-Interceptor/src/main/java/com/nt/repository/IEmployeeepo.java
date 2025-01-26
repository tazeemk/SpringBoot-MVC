package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Employee;

public interface IEmployeeepo extends JpaRepository<Employee, Integer> 
{

   @Query(" from Employee where deptno in (:dept1 ,:dept2, :dept3) and sal<=:salary and ename like :e% or job like :j% ")
	  public List<Employee>dynamicSearch(Integer dept1,Integer dept2,Integer dept3,Character e,Character j ,Double salary);
	
   
	public List<Employee> findByename(String name);
}
