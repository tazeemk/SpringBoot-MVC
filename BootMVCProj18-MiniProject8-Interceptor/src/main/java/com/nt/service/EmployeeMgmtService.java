package com.nt.service;
import static com.nt.utils.AppConstant.EMPTY;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.IEmployeeepo;

@Service
public class EmployeeMgmtService implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeepo empRepo;
	
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
	public List<Employee> dynamicEmployee(Integer dept1, Integer dept2, Integer dept3,Employee emp) 
	{                        
		       
		
		if(EMPTY.equalsIgnoreCase(emp.getEname())||emp.getEname().length()==0)
		    emp.setEname(null);
		String ename =emp.getEname();
		
		Character n = (ename == null) ? null : ename.charAt(0);		
			              
		                        
		                  
	                        //get the job from emp
		
		if(emp.getJob().equalsIgnoreCase("")||emp.getJob().length()==0)
		    emp.setJob(null);
		String job=emp.getJob();
		
		Character j = (job == null) ? null : job.charAt(0);		
			              
	                        
	                       //get the salary from emp
	                      Double Salary = emp.getSal();  
			return empRepo.dynamicSearch(dept1, dept2, dept3, n,j,Salary);
		
	}

}
