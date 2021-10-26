package com.tahmid;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        String phone, pass, name, address;
        int choice, contactIndex = 0;

        ArrayList<User> users = new ArrayList<User>();
        ArrayList<ArrayList<EmergencyContact>> emergencyContacts = new ArrayList<ArrayList<EmergencyContact>>();

        emergencyContacts.add(new ArrayList<EmergencyContact>());
        emergencyContacts.add(new ArrayList<EmergencyContact>());
        emergencyContacts.add(new ArrayList<EmergencyContact>());

        users.add(new User("Tahmid", "017", "bari", "123"));

        // Hospital
        emergencyContacts.get(0).add(new Hospital("Al Haramain Hospital","0821-729981", "N206, Sylhet, Sylhet Division, Sylhet 3100"));
        emergencyContacts.get(0).add(new Hospital("Mount Adora Hospital","01786-637476", "Nayasarak Rd, Sylhet 3100"));
        emergencyContacts.get(0).add(new Hospital("IBN SINA HOSPITAL ","09636-300300", "Mirabazar-Subhanighat Rd, Sylhet 3100"));

        // Police
        emergencyContacts.get(1).add(new Police("Metropolitan Police ","0821-716968", "Sylhet, Bondor"));
        emergencyContacts.get(1).add(new Police("Rapid Action Battalion - 9"," 01777-710999", "ঢাকা - সিলেট মহাসড়ক, Sylhet"));
        emergencyContacts.get(1).add(new Police("Kotwali Model Police Station ","01713-374517", "Kazir Bazar Rd, Sylhet 3100"));

        // FireService
        emergencyContacts.get(2).add(new FireService("Fire Service & Civil Defence Station","01730-336644", "Sheikhghat - Kazirbazar Rd, Sylhet"));
        emergencyContacts.get(2).add(new FireService("Alampur Fire Station","01704-681679", "Alampur, Sylhet"));
        emergencyContacts.get(2).add(new FireService("Fire Service & Civil Defence Station, Gotatikor"," 01716-722118", "Gotatikor, Sylhet"));


        boolean mainLoop = true;
        // main work station for the program
        while(mainLoop){
            boolean loginLoop = false;
            System.out.println("______________________________________");
            System.out.println("| Welcome to Emergency System        |");
            System.out.println("| Choose from following options:-    |");
            System.out.println("| -------------------------------    |");
            System.out.println("| 1-Login \t\t\t\t\t\t     |");
            System.out.println("| 2-Create account \t\t\t\t     |");
            System.out.println("| 0-Exit \t\t\t\t\t\t     |");
            System.out.println("_______________________________________");
            System.out.print("=> Choose one: ");

            choice = input.nextInt();
            switch(choice) {
                case 0:
                    mainLoop = false;
                    break;
                case 1:
                    System.out.println("Enter Phone Number: ");
                    phone = input.next();
                    System.out.println("Enter password: ");
                    pass = input.next();
                    for (User user:
                         users) {
                        if(user.login(phone, pass)){
                            System.out.println("_______________________________________");
                            System.out.println("| Login confirmed! \t\t\t     |");
                            System.out.println("| Welcome, " + user.name + "\t\t\t     |");
                            System.out.println("_______________________________________");
                            loginLoop = true;
                            break;
                        }
                    }
                    if(!loginLoop) {
                        System.out.println("Access denied!");
                    }
                    break;
                case 2:
                    System.out.println("Enter  Name: ");
                    name = input.next();
                    System.out.println("Enter Phone number: ");
                    phone = input.next();
                    System.out.println("Enter address: ");
                    address = input.next();
                    System.out.println("Enter password: ");
                    pass = input.next();
                    users.add(new User(name, phone, address, pass));
                    break;
            }

            // after login
            while (loginLoop){
                boolean contactLoop = false;
                System.out.println("");

                System.out.println("| -------------------------------        |");
                System.out.println("| Select Emergency Contact \t\t\t     |");
                System.out.println("| 1-Hospital \t\t\t                 |");
                System.out.println("| 2-Police \t\t\t                     |");
                System.out.println("| 3-Fire Service \t\t\t             |");
                System.out.println("| 0-Logout \t\t\t                     |");
                System.out.println("| -------------------------------        |");
                System.out.println("");

                System.out.print("=> Choose one: ");
                System.out.println("");

                choice = input.nextInt();
                if(choice > 3){
                    System.out.println("Invalid option");
                    continue;
                }
                switch(choice) {
                    case 0:
                        loginLoop = false;
                        break;
                    default:
                        contactLoop = true;
                        contactIndex = choice - 1;
                        break;
                }
                while(contactLoop){
                    for (int i = 0; i < emergencyContacts.get(contactIndex).size(); i++) {
                        System.out.println(i + ". " + emergencyContacts.get(contactIndex).get(i).name + ", " +emergencyContacts.get(contactIndex).get(i).address);
                    }
                    int choice2 = input.nextInt();
                    System.out.println("");
                    emergencyContacts.get(contactIndex).get(choice2).call();
                    contactLoop = false;
                }
            }
        }
    }
}
