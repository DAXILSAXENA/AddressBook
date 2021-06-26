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

	public void addContactList() {
		while (true) {
			System.out.println("1. Display all contacts");
			System.out.println("2. Add contact");
			System.out.println("3. Edit contact");
			System.out.println("4. Delete contact");
			System.out.println("6. Exit");
			int option = sc.nextInt();

			switch (option) {
			case 1:
				contactFunctions.display(contactList);
				break;
			case 2:
				contactFunctions.addContact(contactList);
				break;
			case 3:
				contactFunctions.editContact(contactList);
				break;
			case 4:
				contactFunctions.deleteContact(contactList);
				break;
			}
			if (option == 6) {
				break;
			}
		}
	}
}
