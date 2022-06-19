package com.greatLearning.Service;

import java.util.Random;

import com.greatLearning.model.Employee;

/**
 * 
 * @author Ayush
 * 
 * This is the CredentialService class that provides function to create and display a user credentials.
 * It implements ICredentialService interface.
 *
 */

public class CredentialService implements ICredentialService {

	@Override
	public String generatePassword(Employee employee) {
		String capitalLetters = "ABDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String digits = "0123456789";
		String symbols = "@#$%^&*-+<>?_";
		String passwordCharacters = capitalLetters + smallLetters + digits + symbols;
		Random random = new Random();
		
		StringBuilder password = new StringBuilder();
		for(int i = 0; i < 8; i++) {
			int randomCharacterIdx = random.nextInt(passwordCharacters.length());
			password.append(passwordCharacters.charAt(randomCharacterIdx));
		}
		return password.toString();
	}

	@Override
	public String getEmailAddress(Employee employee) {
		return employee.getFirstName() + employee.getLastName() + "@" + 
				employee.getDepartment().getDepartmentName() + "." + employee.getCompany() + ".com";
	}

	@Override
	public void showCredentials(Employee employee) {
		System.out.println("Dear " + employee.getFirstName() + ", you creadential are mentioned below -");
		System.out.println("Email -> " + employee.getCredentials().getEmail());
		System.out.println("Password -> " + employee.getCredentials().getPassword());
	}

}
