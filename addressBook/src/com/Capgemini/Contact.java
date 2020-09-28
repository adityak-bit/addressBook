package com.Capgemini;

public class Contact {
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	long zip;
	long phoneNumber;
	String email;

	public Contact(String firstName, String lastName, String address, String city, String state, long zip,
			long phoneNumber, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

}
