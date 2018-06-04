package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("thatSillyCOach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}

}
