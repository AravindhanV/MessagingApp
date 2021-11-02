package com.bridgelabz.messagingapp.service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.messagingapp.model.Greeting;
import com.bridgelabz.messagingapp.model.User;
import com.bridgelabz.messagingapp.repository.GreetingRepository;

@Service
public class GreetingService implements IGreetingService {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@Autowired
	private GreetingRepository greetingRepository;

	@Override
	public Greeting addGreeting(User user) {
		String message = String.format(template, (user.toString().isEmpty()) ? "Hello World" : user.toString());
		return greetingRepository.save(new Greeting(counter.incrementAndGet(), message));
	}
	
	@Override
	public Greeting getGreetingById(long id) {
		return greetingRepository.getById(id);
	}
	
	@Override
	public List<Greeting> getAllGreetings() {
		return greetingRepository.findAll();
	}
	
	@Override
	public Greeting editGreeting(long id, User user) {
		String message = String.format(template, (user.toString().isEmpty()) ? "Hello World" : user.toString());
		Optional<Greeting> greetingData = greetingRepository.findById(id);
		if (greetingData.isPresent()) {
			Greeting greeting = greetingData.get();
			greeting.setUserName(message);
			greetingRepository.save(greeting);
			return greeting;
		}
		return null;
	}

}
