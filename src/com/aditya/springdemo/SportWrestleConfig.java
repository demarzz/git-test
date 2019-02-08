package com.aditya.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// third way for spring configuration using java code
@Configuration
//@ComponentScan("com.aditya.springdemo")

public class SportWrestleConfig {
	
	// define method to expose bean
	@Bean
	public FortuneService winFortuneService() {
		return new WinFortuneService();
	}
	
	
	@Bean
	public Coach wrestlingCoach() {
		return new WrestlingCoach(winFortuneService());
	}

}
