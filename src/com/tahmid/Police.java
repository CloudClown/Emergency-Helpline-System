package com.tahmid;

public class Police extends EmergencyContact{
    Police(String _name, String _number, String _address){
        super(_name, _number, _address);
    }
    void call() {
        System.out.println("| -------------------------------    |");
        System.out.println("Calling " + this.name + " Police at number: " + number );
        System.out.println("| -------------------------------    |");

    }
}
