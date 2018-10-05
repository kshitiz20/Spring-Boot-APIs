package com.CorsTest.Corstest;

import javax.servlet.Filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CorstestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CorstestApplication.class, args);
	}
	
	@Bean
	public FilterRegistrationBean register() {
		FilterRegistrationBean r= new FilterRegistrationBean(new CORSFilter());
		r.setName("CorsFilter");
		r.addUrlPatterns("/*");
		r.setOrder(1);
		return r;
		
		
		
	}
}
