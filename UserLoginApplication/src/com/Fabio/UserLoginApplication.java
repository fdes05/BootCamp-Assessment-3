package com.Fabio;

import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {

		User user = new User();
		UserService userService = new UserService();
		Scanner scanner = new Scanner(System.in);
	
		userService.userLoginInfo();
		
		

	}

	

}
