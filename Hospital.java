package com.tahmid;

public class Hospital extends EmergencyContact{
     Hospital(String _name, String _number,String _address){
        super(_name, _number,  _address);
    }
    void call() {
        System.out.println("| -------------------------------    |");
        System.out.println("Calling " + this.name + " Hospital at number: " + number);
        System.out.println("| -------------------------------    |");
        System.out.println("");
    }
}
