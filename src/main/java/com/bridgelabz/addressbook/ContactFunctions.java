package com.bridgelabz.addressbook;

import java.util.*;

public class ContactFunctions {

	public void add(ContactItems contactItems, ArrayList<ContactItems> contactList) {

		contactList.add(contactItems);
	}

	public void edit(ContactItems contactItems) {

	}

	public void display(ArrayList<ContactItems> contactList) {
		for (ContactItems contactItems : contactList) {
			System.out.println(contactItems);
		}
	}
}