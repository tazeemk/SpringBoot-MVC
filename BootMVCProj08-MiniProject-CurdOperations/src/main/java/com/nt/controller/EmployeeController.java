package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.entity.Emp;
import com.nt.service.IEmployeeServiceImpl;

@Controller
public class EmployeeController 
{
	
	
    @Autowired
	private IEmployeeServiceImpl service;
	
	@GetMapping("/")
    public String Home() {
    	
    	return "welcome";
    }
    @GetMapping("/request")
	public String showDetails(Map<String, Object>map) 
    {
    	List<Emp>list= service.getAllDetils();
	    map.put("emp1", list); 
           	
		return "user_detail";
	}
    @PostMapping("")
    public String getDetail() 
    {
    
    	return "welcome";
    }
			
}
