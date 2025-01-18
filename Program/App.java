package com.Program;

public class App {
	private static String email="sunita@gmail.com";
	private static long mobile=7498824402l;
	private static String password="Sunita@12345";
	
	public static void logIn(String email,String password) {
		if(email.equals(App.email) && password.equals(App.password))
			System.out.println("Log in Successful");
		else
			System.out.println("Invalid email or password");
		
	}
	
	public static void logIn(long mobile,String password) {
		if(mobile == App.mobile && password.equals(App.password))
			System.out.println("Log in Successful");
		else
			System.out.println("Invalid mobile or password");
		
	}

}
