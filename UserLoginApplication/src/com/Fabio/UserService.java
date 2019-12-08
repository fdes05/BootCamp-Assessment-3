package com.Fabio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserService {
	
	public User createUser(String username, String password, String name) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		return user;
	}
		
	public void userLoginInfo() {
		
		String [] userCredentials = null;
		User[] userCredentialsObject = new User[4];
		
		try {
		BufferedReader fileReader = new BufferedReader(new FileReader("data.txt"));
				
		String line = "";
		int i = 0;
		while ((line = fileReader.readLine()) != null &&  i < 4) {
			// line.split(",");
			
			userCredentials = line.split(",");
			System.out.println("the length of the array is " + userCredentials.length);
			System.out.println(line);
			String username = (userCredentials[0]);
			String password = (userCredentials[1]);
			String name = (userCredentials[2]);
			
			userCredentialsObject[i] = createUser(username, password, name);
			i++;
			}
			
			
		}catch (FileNotFoundException e){
			System.out.println("File was not found!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("I/P Exception");
			e.printStackTrace();
		}
		
		for  (int i = 0; i < 4; i++) {
			System.out.println((userCredentialsObject[i].getName()) + " " +
					(userCredentialsObject[i].getUsername()) + " " + (userCredentialsObject[i].getPassword()));
		}
		
		
		
	}
			
	public String compareUserInputToFile(String nameInput, String usernameInput, String passwordInput) {
		String match = "yes";
		String noMatch = "no";
		
		if (UserService.userCredentialsObject[])
		
		return match;
		
		return noMatch;
	}
		
		
	
	
}
