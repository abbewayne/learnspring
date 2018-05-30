package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		PingpongCoach theCoach = context.getBean("myCoach", PingpongCoach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		
		
		//call our new methods to get the literal valuew
		//System.out.println(theCoach.getEmailAddress());
		//System.out.println(theCoach.getTeam());
		//Random random = new Random();
		//int ran = random.nextInt(3);
		//String[] ranlucky = {"You are No.1", "Try harder, then you will win", "Never give up"};
		//System.out.println(ranlucky[ran]); 
		//close the context
//		context.close();
	}

}
