package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

// Ability to add a new Contact to Address Book
// - Use Console to add person details from AddressBookMain class
// - Use Object Oriented Concepts to manage relationship between AddressBook and Contact Person
class Contact{
    String first_name,last_name,address,city,state,email,phone_number;
    int zip;
    Contact(String first_name,String last_name,String address,String city,
            String state, String email, String phone_number, int zip){
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.phone_number = phone_number;
        this.zip = zip;
    }
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "First Name ='" + first_name + '\'' +
                ", Last Name ='" + last_name + '\'' +
                ", Address ='" + address + '\'' +
                ", City ='" + city + '\'' +
                ", State ='" + state + '\'' +
                ", Email ='" + email + '\'' +
                ", Phone Number ='" + phone_number + '\'' +
                ", Zip Code =" + zip +
                '}';
    }
}

public class Address_Book_System{
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
        String first_name,last_name,address,city,state,email,phone_number;
        int zip;
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        ArrayList<Contact> arr = new ArrayList<>();
        do {
            System.out.println("Press 1 - Add a new contact : ");
            System.out.println("Press 2 - Edit an existing contact : ");
            System.out.println("Press 3 - To Exit");
            choice = sc.nextInt();
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
                    Contact newContact = new Contact(first_name,last_name,address,city,state,email,phone_number,zip);
                    arr.add(newContact);
                    for(Contact contact : arr){
                        System.out.println(contact);
                    }
                    break;

                case 2:
                    System.out.println("Enter the First_Name you want to edit that perticular contact : ");
                     String new_f_n=sc.next();
                    for(Contact contact : arr){
                        if (contact.getFirst_name().equals(new_f_n)){
                            System.out.println("Enter New Details : "+
                                    "\nFirst name : ");             String newFirst_name = sc.next();   contact.setFirst_name(newFirst_name);
                            System.out.println("Last name : ");     String newLast_name = sc.next(); contact.setLast_name(newLast_name);
                            System.out.println("Address : ");       String newAddress = sc.next(); contact.setAddress(newAddress);
                            System.out.println("City : ");          String newCity = sc.next(); contact.setCity(newCity);
                            System.out.println("State : ");       String newState = sc.next(); contact.setState(newState);
                            System.out.println("Email : ");     String newEmail = sc.next(); contact.setEmail(newEmail);
                            System.out.println("Phone number : ");       String newPhone_number = sc.next(); contact.setPhone_number(newPhone_number);
                            System.out.println("Zip Code : ");          int newZip = sc.nextInt(); contact.setZip(newZip);
                        }
                    }
                    for(Contact contact : arr){
                        System.out.println(contact);
                    }
                    break;

                default:
                    System.out.println("Thank you...");
            }
        }while (choice != 3);
        for(Contact contact : arr){
            System.out.println(contact);
        }

    }
}
