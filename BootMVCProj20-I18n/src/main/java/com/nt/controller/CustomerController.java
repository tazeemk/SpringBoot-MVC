package com.nt.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.nt.model.Customer;

@Controller
public class CustomerController 
{

	@GetMapping("/")
	public String home(Map<String,Object>map) {
		map.put("date", new Date());
		map.put("per", (67/100));
		
		return"welcome";
	}
	
	@GetMapping("/r")
	public String empReg(@ModelAttribute("cust")Customer cust) {
		
		return "regist_form";
	}
}
