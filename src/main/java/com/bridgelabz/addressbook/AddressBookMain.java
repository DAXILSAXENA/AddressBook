package com.bridgelabz.addressbook;

public class AddressBookMain {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zip;
	private String phoneNumber;
	private String email;

	public AddressBookMain(String firstName, String lastName, String address, String city, String state, int zip,
			String phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public void contactsList() {

		System.out.println("firstname: " + firstName);
		System.out.println("lastname: " + lastName);
		System.out.println("address: " + address);
		System.out.println("city: " + city);
		System.out.println("state: " + state);
		System.out.println("zip: " + zip);
		System.out.println("phoneNumber: " + phoneNumber);
		System.out.println("email: " + email);

	}

	public static void main(String[] args) {

		System.out.println("Welcome to the Address book program");
		AddressBookMain contact = new AddressBookMain("Daxil", "Saxena", "RajNagar", "Ghaziabad", "UttarPradesh",
				201001, "9999999999", "abc@gmail.com");
		contact.contactsList();
	}

}