package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {

	static Scanner sc = new Scanner(System.in);
	static ContactFunctions contactFunctions = new ContactFunctions();

	// Main method
	public static void main(String[] args) {

		System.out.println("Welcome to the Address book program"); // Welcome statement
		AddressBookMain addressBookMain = new AddressBookMain();
		addressBookMain.addContactList();
	}

	public void addContact() {

		ContactItems contactItems = new ContactItems();

		System.out.println("Enter first name : ");
		contactItems.firstName = sc.next();

		System.out.println("Enter last name : ");
		contactItems.lastName = sc.next();

		System.out.println("Enter address : ");
		contactItems.address = sc.next();
		sc.nextLine();

		System.out.println("Enter city : ");
		contactItems.city = sc.next();

		System.out.println("Enter state : ");
		contactItems.state = sc.next();

		System.out.println("Enter zip code : ");
		contactItems.zip = sc.nextInt();

		System.out.println("Enter phone number : ");
		contactItems.phoneNumber = sc.next();

		System.out.println("Enter email : ");
		contactItems.email = sc.next();

		contactFunctions.add(contactItems);

	}

	public void addContactList() {
		while (true) {
			System.out.println("1. Display all contacts");
			System.out.println("2. Add contact");
			int option = sc.nextInt();

			switch (option) {
			case 1:
				contactFunctions.display();
				break;
			case 2:
				addContact();
				break;
			default:
				break;
			}
	}
}
}