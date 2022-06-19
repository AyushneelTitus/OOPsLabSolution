package com.greatLearning;

import java.util.Scanner;

import com.greatLearning.Service.CredentialService;
import com.greatLearning.model.Credentials;
import com.greatLearning.model.Department;
import com.greatLearning.model.Employee;

/**
 * 
 * @author Ayush
 * 
 * Driver class to run the program.
 * This class takes in Employee name and department and creates appropriate email and password.
 *
 */
public class DriverClass {
	
	public static void main(String[] args) {
		Employee employee;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome User");
		System.out.println("Please enter your first name -");
		String firstName = sc.nextLine();
		System.out.println("Please enter your last name -");
		String lastName = sc.nextLine();
		employee = new Employee(firstName, lastName);
		CredentialService credentialService = new CredentialService();
		
		System.out.println("Please choose your depaetment -");
		System.out.println("1. Technical\n2. Admin\n3. Human Resource\n4. Legal");
		int in =  sc.nextInt();
		switch (in) {
			case 1:{
				employee.setDepatment(new Department("technical"));
			}
			break;
			
			case 2:{
				employee.setDepatment(new Department("admin"));
			}
			break;
			
			case 3:{
				employee.setDepatment(new Department("humanResource"));
			}
			break;
			
			case 4:{
				employee.setDepatment(new Department("legal"));
			}
			break;
		}
		String userEmail = credentialService.getEmailAddress(employee);
		String userPassword = credentialService.generatePassword(employee);
		employee.setCredentials(new Credentials(userEmail, userPassword));
		
		credentialService.showCredentials(employee);
	}

}
