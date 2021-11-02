package com.bridgelabz.messagingapp.model;

public class Greeting {

	private long UserId;
	private String userName;

	public Greeting(long userId, String userName) {
		super();
		UserId = userId;
		this.userName = userName;
	}

	public long getUserId() {
		return UserId;
	}

	public void setUserId(long userId) {
		UserId = userId;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}

