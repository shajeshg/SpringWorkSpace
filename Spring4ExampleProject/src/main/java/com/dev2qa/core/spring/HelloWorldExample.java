package com.dev2qa.core.spring;

public class HelloWorldExample {

	private String userName = "";

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void printHello()
	{
		System.out.println("Hello " + this.getUserName() + ", you are welcome to Spring world.");
	}
}
