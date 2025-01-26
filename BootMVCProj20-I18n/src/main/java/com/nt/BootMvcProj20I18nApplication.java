package com.nt;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class BootMvcProj20I18nApplication {

	@Bean("localeResolver")//fixed bean
	public 	SessionLocaleResolver createLocale() {
		
		SessionLocaleResolver resolver = new SessionLocaleResolver();
		resolver.setDefaultLocale(new Locale("en","US"));
	return resolver;
	}
	
	@Bean
	public LocaleChangeInterceptor create()
	{
		LocaleChangeInterceptor inter= new LocaleChangeInterceptor();
		inter.setParamName("lang");
		return inter;
	}	
	
	
	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj20I18nApplication.class, args);
	}

}
