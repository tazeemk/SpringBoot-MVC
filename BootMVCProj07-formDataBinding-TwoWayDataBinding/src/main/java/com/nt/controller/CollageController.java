package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CollageController 
{

	@GetMapping("/")
	public String getHome(@RequestParam("sno")int no,@RequestParam(required = true ,defaultValue = "devnag")String name,Map<String, Object>map) {
      System.out.println(no+ " " +name);
		map.put("no", no);
		map.put("name:", name);
				return "welcome";
				
	}
	
}
