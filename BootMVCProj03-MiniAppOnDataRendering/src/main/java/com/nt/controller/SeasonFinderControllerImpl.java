package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.ISeasonFinderService;

@Controller
public class SeasonFinderControllerImpl 
{
   @Autowired
   private ISeasonFinderService service;	
	
   @RequestMapping("/")
    public String home() {
    	
    	return "welcome";
    }
   
   
   
	@RequestMapping("/season")
     public String find(Map<String,Object>map) {
    	 //get the business method
    	 String result =service.findSeason();
    	 map.put("msg", result);
    	 return "season";
     }
	
}
