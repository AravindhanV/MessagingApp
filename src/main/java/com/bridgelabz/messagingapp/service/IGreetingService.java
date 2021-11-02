package com.bridgelabz.messagingapp.service;

import java.util.List;

import com.bridgelabz.messagingapp.model.Greeting;
import com.bridgelabz.messagingapp.model.User;

public interface IGreetingService {

	Greeting addGreeting(User user);
	Greeting getGreetingById(long id);
	List<Greeting> getAllGreetings();
}
