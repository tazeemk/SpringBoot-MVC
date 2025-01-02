package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.model.Student;

@Controller
public class StudentController 
{

	
	   @RequestMapping("/")
	   public String home() {
		   
		   return"welcome";
	   }
	   
	   @GetMapping("/register")
	   public String signIn(@ModelAttribute("stud")Student st) 
	   {
		   
		return "form_fill";   
	   }
	   
	   @PostMapping("/register")
	   public String show(@ModelAttribute("stud")Student st,Map<String, Object>map) 
	   {
		   map.put("msg", st);
		   System.out.println(st);
		   return"show_result";
	   }
	   
}
