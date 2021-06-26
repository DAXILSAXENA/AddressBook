package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

	static Scanner sc = new Scanner(System.in);
	static ContactFunctions contactFunctions = new ContactFunctions();
	static ArrayList<ContactItems> contactList = new ArrayList<>();

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
		sc.next();

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

		contactFunctions.add(contactItems, contactList);

	}

	public void editContact() {

		System.out.println("Enter the first name of contact you wish to edit");
		String edit = sc.next();
		System.out.println("Press 1 - To edit first name");
		System.out.println("Press 2 - To edit last name");
		System.out.println("Press 3 - To edit address");
		System.out.println("Press 4 - To edit city");
		System.out.println("Press 5 - To edit state");
		System.out.println("Press 6 - To edit zip code");
		System.out.println("Press 7 - To edit phone number");
		System.out.println("Press 8 - To edit email");
		int choice = sc.nextInt();
		if (choice == 1) {
			for (ContactItems contactItems : contactList) {
				if (contactItems.firstName.equals(edit)) {
					System.out.println("Enter new first name");
					contactItems.firstName = sc.next();
				}
			}
		} else if (choice == 2) {
			for (ContactItems contactItems : contactList) {
				if (contactItems.firstName.equals(edit)) {
					System.out.println("Enter new last name");
					contactItems.lastName = sc.next();
				}
			}
		} else if (choice == 3) {
			for (ContactItems contactItems : contactList) {
				if (contactItems.firstName.equals(edit)) {
					System.out.println("Enter new address");
					contactItems.address = sc.next();
				}
			}
		} else if (choice == 4) {
			for (ContactItems contactItems : contactList) {
				if (contactItems.firstName.equals(edit)) {
					System.out.println("Enter new city");
					contactItems.city = sc.next();
				}
			}
		} else if (choice == 5) {
			for (ContactItems contactItems : contactList) {
				if (contactItems.firstName.equals(edit)) {
					System.out.println("Enter new state");
					contactItems.state = sc.next();
				}
			}
		} else if (choice == 6) {
			for (ContactItems contactItems : contactList) {
				if (contactItems.firstName.equals(edit)) {
					System.out.println("Enter new zip code");
					contactItems.zip = sc.nextInt();
				}
			}
		} else if (choice == 7) {
			for (ContactItems contactItems : contactList) {
				if (contactItems.firstName.equals(edit)) {
					System.out.println("Enter new phone number");
					contactItems.phoneNumber = sc.next();
				}
			}
		} else {
			for (ContactItems contactItems : contactList) {
				if (contactItems.firstName.equals(edit)) {
					System.out.println("Enter new email");
					contactItems.email = sc.next();
				}
			}
		}
	}

	public void addContactList() {
		while (true) {
			System.out.println("1 - Display all contacts");
			System.out.println("2 - Add contact");
			System.out.println("3 - Edit contact");
			System.out.println("6 - Exit");
			System.out.println("Enter your choice");
			int option = sc.nextInt();
			sc.nextLine();

			switch (option) {
			case 1:
				contactFunctions.display(contactList);
				break;
			case 2:
				addContact();
				break;
			case 3:
				editContact();
				break;
			}
			if (option == 6) {
				break;
			}
		}
	}
}
