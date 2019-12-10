package com.Fabio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserService {
	
	User[] userCredentialsArray = new User[4];
	
	public User createUser(String username, String password, String name) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		return user;
	}
		
	public void userLoginInfo() {
		
		String [] userCredentials = null;
		
		
		try {
		BufferedReader fileReader = new BufferedReader(new FileReader("data.txt"));
				
		String line = "";
		int i = 0;
		while ((line = fileReader.readLine()) != null &&  i < 4) {
					
			userCredentials = line.split(",");
			System.out.println("the length of the array is " + userCredentials.length);
			System.out.println(line);
			String username = (userCredentials[0]);
			String password = (userCredentials[1]);
			String name = (userCredentials[2]);
			
			userCredentialsArray[i] = createUser(username, password, name);
			i++;
		}
			
			
		}catch (FileNotFoundException e){
			System.out.println("File was not found!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("I/O Exception");
			e.printStackTrace();
		}
		
		for  (int i = 0; i < 4; i++) {
			System.out.println((userCredentialsArray[i].getName()) + " " +
					(userCredentialsArray[i].getUsername()) + " " + (userCredentialsArray[i].getPassword()));
		}
		
				
	}
			
	public String compareUserInputToFile(String username, String password) {
		String match = "yes";
		String noMatch = "no";
		String usernameInput = username;
		String passwordInput = password;
		
		for (int i = 0; i < 4;) {
			String usernameA =userCredentialsArray[i].getUsername();
			String passwordA = userCredentialsArray[i].getPassword();
			
			if (usernameA.equals(usernameInput) && passwordA.equals(passwordInput)){
		    	return match;
		    }else {
		    	i++;
		    }
		}		
		return noMatch;
	}
		
		
	
	
}
