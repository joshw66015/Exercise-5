package com.company;

import java.util.Scanner;

public class Main {
            static Scanner input = new Scanner(System.in);
        static void addPersonMethod(Address addPeople){
            String getName = "";
            System.out.println("Who are you adding?");
            getName =input.nextLine();
            System.out.println("What is the email?");
            String getEmail =input.nextLine();
            Contact newPerson = new Contact(getName,getEmail);
            addPeople.setPerson(newPerson);
    }
        static void findPersonMethod (Address findPerson){
            String getName = "";
            System.out.println("Who do you want to look up?");
            getName =input.nextLine();
            System.out.println("The email for " + getName+ " is " + findPerson.getEmail(getName));
    }
        public static void main(String[] args) {
            int choice;
            Contact Hudson = new Contact("Hudson" , "hud@gmail.com");
            Contact Grubb = new Contact("Grubb" , "grubb@gmail.com");
            Address addPeople = new Address();
            addPeople.setPerson(Hudson);
            addPeople.setPerson(Grubb);
        do{
            System.out.println("1) To add people" +
                    "\n2) To look up someones email" +
                    "\n3) exit");
            choice =input.nextInt();
            input.nextLine();
            switch (choice){
                case 1: addPersonMethod(addPeople);
                    break;
                case 2: findPersonMethod(addPeople);
                    break;
            }
        }while(choice != 0);
    }
}