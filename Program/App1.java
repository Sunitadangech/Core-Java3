package com.Program;

public class App1 {
	private int pin=1234;
	
	private String name;
	private String password;
	
	public App1(String name,String password) {
		this.name=name;
		this.password=password;
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPassword(String password,int pin) {
		if(pin == this.pin) {
			this.password=password;
		}
		else {
			System.out.println("Invalid Pin");
		}
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String toString() {
		return "name : " +this.name + " password : " +this.password ;
	}

}


