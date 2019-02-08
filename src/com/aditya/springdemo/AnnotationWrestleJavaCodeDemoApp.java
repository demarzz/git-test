package com.aditya.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationWrestleJavaCodeDemoApp {

	public static void main(String[] args) {
		//read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportWrestleConfig.class);
		
		//retrieve the bean
		
	
		Coach bc1 = context.getBean("wrestlingCoach", Coach.class);
		
		
		//call methods
		System.out.println(bc1.getDailyWorkout());
		
		System.out.println(bc1.getFortune());
		

		
		//close context
		context.close();

	}

}
