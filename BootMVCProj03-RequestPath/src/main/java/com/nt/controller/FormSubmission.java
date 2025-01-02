package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@RequestMapping("hello")
@Controller
public class FormSubmission {

	
	  @RequestMapping("/")//we can map with multiple request path public String
	  public String devang() {
	  
	  return "home"; }
	  
	 
	  
	  @GetMapping("/all") 
	  public String get() 
	  {
	  
	  return "forward:req";
	  
	  }
	 
	@GetMapping("req")
	public String prac() {

		return "redirect:all";
	}
	
	  @PostMapping 
	  public String post() {
	  
	  return "display1";
	  
	  }
	 

	
	 //@RequestMapping(value="submi",method = RequestMethod.POST)
	  //@PostMapping("/HOME")
	  
	  @RequestMapping("HOME") 
	  public String submit() {
	  
	  return "home_report"; }
	 

}
