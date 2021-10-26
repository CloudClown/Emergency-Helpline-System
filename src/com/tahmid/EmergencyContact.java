package com.tahmid;

public abstract class EmergencyContact {
    String number;
    String name;
    String address;

    EmergencyContact(String _name, String _number, String address){
        this.name = _name;
        this.number = _number;
        this.address = address;
    }

    abstract void call();
}
