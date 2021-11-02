package com.bridgelabz.messagingapp.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="GREETINGS")
public class Greeting {

	private long userId;
	private String userName;
	
	public Greeting() {
		userId = 0;
		userName = "";
	}

	public Greeting(long userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}

