/**
 * 
 */
package com.gl.email.service;

import com.gl.email.model.Employee;

import java.util.Random;

/**
 * @author Rohan Chakraborty
 *	This class is the implementation class of Credential service Interface.
 *	This class holds the method to generate password, email and show credentials
 */
public class CredentialServicesImpl implements CredentialService {

	@Override
	public String generatePassword() {
		//creating object of class Random, a predefined class of java to generate random numbers.
		Random rand = new Random();
		//setting the length of the password
		int length = 10;

		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			//getting the numeric value using the ASCII values
			char numeric = (char) (rand.nextInt(57 - 48) + 48);
			//using random class to get a random value of all lower alphabet ASCIIs and then store in char variable
			char lowerCase = (char) (rand.nextInt(122 - 97) + 97);
			//random of upper case alphabet ASCIIs
			char upperCase = (char) (rand.nextInt(90 - 65) + 65);
			//random of special character alphabet ASCIIs
			char specialChar = (char) (rand.nextInt(47 - 33) + 33);
			//storing the random characters in one place
			String values = Character.toString(upperCase) + Character.toString(lowerCase) + Character.toString(numeric)
			+ Character.toString(specialChar);
			//picking any one value from values and setting in password
			password[i] = values.charAt(rand.nextInt(values.length()));
		}
		return new String(password);
	}

	@Override
	public String generateEmail(Employee employee, String department) {
		String depart = null;
		//setting the department as per the choice
		switch (department) {
		case "1":
		case "Technical":
			depart = "tech";
			break;
		case "2":
		case "Admin":
			depart = "admin";
			break;
		case "3":
		case "Human Resource":
			depart = "hr";
			break;
		case "4":
		case "Legal":
			depart = "legal";
			break;
		default:
			System.out.println("Wrong Input. Please select from the list");
			break;
		}
		//setting the first name, last name, @, department and company name together to create the email address
		return (employee.getFirstName() + employee.getLastName()).toLowerCase() + "@" + depart + ".abc.com";
	}

	@Override
	public void showCredentials(Employee employee, String department) {
		//printing the credentials
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follwows:");
		System.out.println("Email: " + generateEmail(employee, department));
		System.out.println("Password: " + generatePassword());
	}

}
