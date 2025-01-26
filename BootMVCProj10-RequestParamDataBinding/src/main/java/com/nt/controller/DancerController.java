package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DancerController 
{

	@GetMapping("/data")
	private String getdata(@RequestParam("id")int did,@RequestParam("dname")String name,@RequestParam()List<Object>addr,Map<String, Object>map) 
	{
		
		System.out.println("id :"+did+" "+"name "+name +addr );
		map.put("Lid", did);
		map.put("Ldname",name);
		map.put("Ldaddr :", addr);
	
		return "welcome";	
	}
}
