package com.aditya.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// third way for spring configuration using java code
@Configuration
//@ComponentScan("com.aditya.springdemo")
@PropertySource("classpath:sports.properties")
public class SportConfig {
	
	// define method to expose bean
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

}
