package com.Program;

public class User1 {

//public class User {
	public static void main(String[] args) {
		App1 user = new App1 ("Sunita" , "Sunita@12345");
		System.out.println(user.toString());
		
		user.setPassword("Sunita@4567" , 1234);
		System.out.println(user.toString());
//	}

}

}
