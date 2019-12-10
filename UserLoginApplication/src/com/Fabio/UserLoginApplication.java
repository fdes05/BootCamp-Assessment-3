package com.Fabio;

import java.util.Scanner;

public class UserLoginApplication {

	static Scanner scanner = new Scanner(System.in);

	
	public static void main(String[] args) {

		UserService userService = new UserService();
			
		userService.userLoginInfo();
				
		int i;
		for (i = 1; i <= 5;) {
			String username = userInputUserName();
			String password = userInputPassword();
			String name = userInputName();
			String compareResult = userService.compareUserInputToFile (username, password);
		
			if (compareResult.equals("yes")) {
				System.out.println("Welcome " + name);
				break;
			}else if (i == 5) {
				System.out.println("Too many failed login attempts, you are now locked out!");
				break;
			}else {
				System.out.println("Username and password are not valid! Please try again.");
				i++;
			}
		}
	}

	public static String userInputUserName() {
			
		System.out.println("Please type your username: ");
		String username = scanner.nextLine();
		return username;
		
	}
	
	public static String userInputPassword() {
		System.out.println("Please type your password: ");
		String password = scanner.nextLine();
		return password;
	}
	
	public static String userInputName() {
		System.out.println("Please type your name: ");
		String name = scanner.nextLine();
		return name;
	}
}
