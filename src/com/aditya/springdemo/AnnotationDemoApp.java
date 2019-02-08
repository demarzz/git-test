package com.aditya.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean
		//Coach bc = context.getBean("tennisCoach", Coach.class); 
		//Coach bc1 = context.getBean("tennisCoach", Coach.class);
		
		//Coach bc1 = context.getBean("tennisCoach", TennisCoach.class);
		
		TennisCoach bc1 = context.getBean("tennisCoach", TennisCoach.class);
		//call methods
		System.out.println(bc1.getDailyWorkout());
		
		System.out.println(bc1.getFortune());
		
		System.out.println(bc1.getEmail());
		
		System.out.println(bc1.getTeam());
		
		context.close();

	}

}
