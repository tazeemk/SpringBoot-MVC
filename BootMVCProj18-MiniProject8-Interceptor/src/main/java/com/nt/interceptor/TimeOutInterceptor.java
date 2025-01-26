package com.nt.interceptor;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class TimeOutInterceptor implements HandlerInterceptor 
{
 
@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
			throws Exception {
	  

	
  String userAgent	=req.getHeader("User-Agent");
  
 	     
	     if(userAgent.contains("Chrome")  && !userAgent.contains("Edge")) {
	    
	    	 return true;
	    	 }
	     else {
	    	 req.getRequestDispatcher("/timeout.jsp").forward(req, res);
	    	 return false;	    	 
	     }
	     
	}	
}
