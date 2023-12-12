package com.bridgelabz;
//Ability to create a Contacts in Address Book with first and last names, address,
//city, state, zip, phone number and email...

public class Address_Book_System {
    static String first_name,last_name,address,city,state,email,phone_number;
    static int zip;
    static void createContacts(){
        System.out.println("Full name : "+first_name+" "+last_name+"\nAddress : "+address+
                "\nCity : "+city+"\nState : "+state+"\nemail : "+email+"\nPhone number : "+
                phone_number+"\nZip : "+zip);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
        first_name="Prakash";
        last_name="Zodge";
        address="ABC sdf 99";
        city = "Sambhajinagar";
        state = "Maharashtra";
        email = "Email";
        zip = 400088;
        phone_number="9876543210";
        createContacts();
    }
}
