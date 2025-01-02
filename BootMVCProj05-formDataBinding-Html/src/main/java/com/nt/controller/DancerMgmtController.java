package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Dancer;

@Controller
public class DancerMgmtController 
{

	
	
	@GetMapping("/")
	public String showHomePage() {
		
		return "Welcome";
	}
	
	@GetMapping("/request")
	public String showform() {
		
		return "form_show";
	}
	
	@PostMapping("/request")
	public String getformData(@ModelAttribute("deva")Dancer dan,Map<String, Object>map) {

		System.out.println(dan);
		
		double fe = dan.getFee();
		if(fe>=1000)
		map.put("fees", "Bakachod");
		else if(fe<=0)
			map.put("fees", "Chapri");
		else
			map.put("fees", "Maha Bakachod");
		map.put("id", dan.getDid());
		
		return "result";
	}
	
}
