package com.project;

public class User {
    String name;
    String phoneNumber;
    String address;
    String pass;

    User(String name,String phoneNumber,String address,String pass){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.pass = pass;
    }
    public boolean login(String phoneNumber,String pass){
        if(this.phoneNumber == phoneNumber || this.pass == pass){
            System.out.println("Login confirmed!");
            return true;
        }
        else{
            System.out.println("Access denied!");
            return false;
        }
    }

}
