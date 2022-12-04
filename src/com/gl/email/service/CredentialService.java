package com.gl.email.service;
/**
 * @author Rohan Chakraborty 
 * This is an interface for Credential Service
 * 
 */
import com.gl.email.model.Employee;

public interface CredentialService {
	//method to generate password
	public String generatePassword();
	//to generate email address
	public String generateEmail(Employee employee, String department);
	//print credentials
	public void showCredentials(Employee employee, String department);
}
