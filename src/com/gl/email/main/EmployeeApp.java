package com.gl.email.main;
/**
 * @author Rohan Chakraborty
 * This is the driver class for Employee Credential Service
 * This class is created to get the name of employee and generate an email and password
 */

import java.util.Scanner;

import com.gl.email.model.Employee;
import com.gl.email.service.CredentialService;
import com.gl.email.service.CredentialServicesImpl;

public class EmployeeApp {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your First Name");
			String firstName = sc.nextLine();
			System.out.println("Enter your last name");
			String lastName = sc.nextLine();
			// creating object for class Employee
			Employee emp = new Employee(firstName, lastName);
			// creating object for interface and implementing class
			CredentialService service = new CredentialServicesImpl();
			//Displaying department choices
			System.out.println("Please enter department from the following:");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			service.showCredentials(emp, sc.next());

		}
	}

}
