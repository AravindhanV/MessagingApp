package com.bridgelabz.messagingapp.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bridgelabz.messagingapp.model.Greeting;
import com.bridgelabz.messagingapp.model.User;

public interface IGreetingService {

	Greeting addGreeting(User user);
	Greeting getGreetingById(long id);
	List<Greeting> getAllGreetings();
	Greeting editGreeting(long id, User user);
	ResponseEntity<HttpStatus> deleteGreeting(long id);
}
