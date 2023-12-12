package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

// Ability to add a new Contact to Address Book
// - Use Console to add person details from AddressBookMain class
// - Use Object Oriented Concepts to manage relationship between AddressBook and Contact Person
class Contact{
    String first_name,last_name,address,city,state,email,phone_number;
    int zip;
    Contact(String first_name,String last_name,String address,String city,String state,
            String email,String phone_number, int zip){
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.phone_number = phone_number;
        this.zip = zip;
    }
    void showContacts(){
        System.out.println("Details is as follows: \nFull name : "+first_name+" "+last_name+"\nAddress : "+address+
                "\nCity : "+city+"\nState : "+state+"\nemail : "+email+"\nPhone number : "+
                phone_number+"\nZip : "+zip);
    }
}
public class Address_Book_System {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
        String first_name,last_name,address,city,state,email,phone_number;
        int zip;
        ArrayList arr = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 - Add a new contact : ");       int choice = sc.nextInt();
        switch (choice){
            case 1 : System.out.println("Enter Details : "+
                    "\nFirst name : ");             first_name = sc.next();
                System.out.println("Last name : ");     last_name = sc.next();
                System.out.println("Address : ");       address = sc.next();
                System.out.println("City : ");          city = sc.next();
                System.out.println("State : ");       state = sc.next();
                System.out.println("Email : ");     email = sc.next();
                System.out.println("Phone number : ");       phone_number = sc.next();
                System.out.println("Zip Code : ");          zip = sc.nextInt();
                Contact prakash = new Contact(first_name,last_name,address,city,state,email,phone_number,zip);
                arr.add(prakash);
                prakash.showContacts();
            default:
                System.out.println("Invalid choice ");
        }

    }
}
