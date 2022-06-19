package com.greatLearning.model;

/**
 * 
 * @author Ayush
 * 
 * This is the Credentials class that contains the email and password for an Employee.
 *
 */

public class Credentials {
	private String email;
	private String password;
	
	public Credentials(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
}
