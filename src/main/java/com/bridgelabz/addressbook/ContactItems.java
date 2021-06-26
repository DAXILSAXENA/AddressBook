package com.bridgelabz.addressbook;

public class ContactItems extends AddressBookMain {

    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    String phoneNumber;
    String email;
    
    @Override
    public String toString() {
        return "ContactItems{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}