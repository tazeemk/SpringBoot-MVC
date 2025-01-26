package com.nt.controller;

import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class Test 
{
    @Autowired
	private ServletContext sc;
	
    @Autowired
    private ServletConfig sg;
    
    @RequestMapping("data")
    public void check(HttpSession hs,HttpServletRequest req,HttpServletResponse res)throws Exception 
    {
    	
    	res.setContentType("text/html");
    	PrintWriter pw = res.getWriter();
    	
    	pw.print("ServletContext"+sc.getContextPath()+"<br>");
    	pw.print("ServletConfig"+sg.getServletName()+"<br>");
    	pw.print("Session"+hs.getId()+"<br>");
    	pw.print("Request :"+req.getRequestURI()+"<br>");
    	pw.print("Response  :"+res.getContentType());
    	
    }
}
