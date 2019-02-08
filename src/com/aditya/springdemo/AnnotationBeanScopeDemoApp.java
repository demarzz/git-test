package com.aditya.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean
		Coach bc = context.getBean("tennisCoach", Coach.class);
		
		
		Coach bc1=context.getBean("tennisCoach",Coach.class);
		
		boolean res = (bc == bc1);
		
		System.out.println("Both the references pointing to same object: "+ res);
		
		System.out.println("bc memory location: "+ bc);
		
		System.out.println("bc1 memory location: "+bc1);
		
		
		context.close();
	}

}
