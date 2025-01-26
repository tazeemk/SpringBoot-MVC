package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.service.IEmployeeServiceRepo;

@Controller
@RequestMapping("bank")
public class BankController 
{
	@Autowired
	private IEmployeeServiceRepo service;

	@GetMapping("/home")
	public String home() {
	
		return "welcome";
	}
	
	@GetMapping("/login")
	public String checkUser() {
		
		return "login_form";
	}
	
	@PostMapping("/loginuser")
	public String submitUser(@RequestParam("username")String uname,@RequestParam("password")String pword,
			Map<String, Object>map,RedirectAttributes rddr) 
	{    
		  String msg=service.checkCrenditials(uname, pword);
		  if(msg.equals("Login Successfully :")) {
		  map.put("msg", msg);
		return "report";
		  }else {
			rddr.addFlashAttribute("result",msg);  
			  return "redirect:home";
		  }
	}
	
	@GetMapping("/empregister")
	public String loadEmployeeform() {
		
		return "emp_regist";
	}
	
	
	
}
