package com.tahmid;

public class FireService extends EmergencyContact{
    FireService(String _name, String _number, String _address){
        super(_name, _number, _address);
    }
    void call() {
        System.out.println("| -------------------------------    |");
        System.out.println("Calling " + this.name + " Fire Service at number: " + number);
        System.out.println("| -------------------------------    |");

    }
}
