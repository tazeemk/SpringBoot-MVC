package com.nt.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class AppConfig implements WebMvcConfigurer {

	@Autowired
	private TimeOutInterceptor interceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	registry.addInterceptor(interceptor).addPathPatterns("/**");
	
	}
	
}
