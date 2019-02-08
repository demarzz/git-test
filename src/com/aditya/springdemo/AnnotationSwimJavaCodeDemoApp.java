package com.aditya.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationSwimJavaCodeDemoApp {

	public static void main(String[] args) {
		//read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//retrieve the bean
		
	
		SwimCoach bc1 = context.getBean("swimCoach", SwimCoach.class);
		
		
		//call methods
		System.out.println(bc1.getDailyWorkout());
		
		System.out.println(bc1.getFortune());
		
		System.out.println(bc1.getEmai());
		
		System.out.println(bc1.getTeam());
		
		//close context
		context.close();

	}

}
