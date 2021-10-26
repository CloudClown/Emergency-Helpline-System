package com.tahmid;

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
        if(this.phoneNumber.equals(phoneNumber) && this.pass.equals(pass)){
            return true;
        }
        else{
            return false;
        }
    }
}
