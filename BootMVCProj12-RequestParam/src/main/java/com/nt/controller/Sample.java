package com.nt.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class Sample 
{
   
    @GetMapping("/home")
    public String get(@RequestParam("nam")String name,Map<String, Object>map)
    {
       map.put("msg", name);
    	System.out.println(name);
    	return " show";
    }
	
}
