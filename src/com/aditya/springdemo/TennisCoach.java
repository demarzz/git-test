package com.aditya.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.ProfileValueSourceConfiguration;

//@Component("sillyCoach")

//default bean-id
@Component  
//@Scope("prototype")

public class TennisCoach implements Coach{
	
	
	//java reflection
	//@Autowired
	//@Qualifier("happyFortuneService")
	//@Qualifier("randomFortuneService")
	private FortuneService fortuneService; 
	
	//literals
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	

	public String getEmail() {
		return email;
	}


	public String getTeam() {
		return team;
	}


	@Override
	public String getDailyWorkout() {
		
		return "Practise back hand";
	}
	
	
	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService")FortuneService fortuneService) {
		System.out.println("qualifer bit tricky inside constructor");
		this.fortuneService = fortuneService;
	}
	//using setter
	//@Autowired
	//public void setFortune(FortuneService fortuneService) {
	//	this.fortuneService = fortuneService;
	
	//can autowire using any method	
	//@Autowired
		//public void doStuff(FortuneService fortuneService) {
		//System.out.println("inside doStuff");
		//	this.fortuneService = fortuneService;
	//}


	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	//custom methods
	@PostConstruct
	public void doMyEarlyStuff() {
		System.out.println("This code will run before actual app");
	}
	
	@PreDestroy
	public void doMyEndStuff() {
		System.out.println("This code will run after actual app");
	}
	
	

}
