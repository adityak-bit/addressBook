package com.Capgemini;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		Scanner in = new Scanner(System.in);
		AddressBook ab = new AddressBook();
		
		System.out.println("Enter first name: ");
		String firstName = in.nextLine();
		
		System.out.println("Enter last name: ");
		String lastName = in.nextLine();
		
		System.out.println("Enter address: ");
		String address = in.nextLine();
		
		System.out.println("Enter city: ");
		String city = in.nextLine();
		
		System.out.println("Enter state: ");
		String state = in.nextLine();
		
		System.out.println("Enter zip: ");
		long zip = in.nextLong();
		
		System.out.println("Enter phone number: ");
		in.nextLine();
		long phoneNumber = in.nextLong();
		
		System.out.println("Enter email: ");
		String email = in.nextLine();
		
		Contact c = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
		ab.addContact(c);
	}

}
