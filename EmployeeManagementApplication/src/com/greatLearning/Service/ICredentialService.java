package com.greatLearning.Service;

import com.greatLearning.model.Employee;

/**
 * 
 * @author Ayush
 * 
 * This is the ICredentialService interface that contains all functions required to generate and display Employee credentials.
 *
 */

public interface ICredentialService {
	String generatePassword(Employee employee);
	String getEmailAddress(Employee employee);
	void showCredentials(Employee employee);
}
