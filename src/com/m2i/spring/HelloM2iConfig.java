package com.m2i.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloM2iConfig {
	
	@Bean
	public HelloM2i helloM2i(){
		return new HelloM2i();
	}
	
}
