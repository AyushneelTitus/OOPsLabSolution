package com.greatLearning.model;

/**
 * 
 * @author Ayush
 * 
 * This is the employee class that contains the information like name, department and credentials of a user.
 *
 */

public class Employee {
	private String firstName;
	private String lastName;
	
	private String company;
	
	private Department depatment;
	private Credentials credentials;
	
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
		company = "abc";
	}

	public Department getDepartment() {
		return depatment;
	}

	public void setDepatment(Department depatment) {
		this.depatment = depatment;
	}

	public Credentials getCredentials() {
		return credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCompany() {
		return company;
	}
}
