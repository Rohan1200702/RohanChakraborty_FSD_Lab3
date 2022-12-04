package com.gl.email.model;
/**
 *@author Rohan Chakraborty
 *This is the class to store employee details like First name and Last name
 */
public class Employee {
	private String firstName = null, lastName = null;

	public Employee(String firstName, String lastName) {
		//parameterized constructor for storing the first and last name
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
