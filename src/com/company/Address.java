package com.company;

import java.util.ArrayList;

public class Address {
    private ArrayList<Contact> personList = new ArrayList<>();

    public void  setPerson(Contact personName){
        personList.add(personName);
    }
    public String getEmail(String personName){
        String email = "It Broke!";
        for(Contact person : personList){
            if (person.getName().equalsIgnoreCase(personName)){
                email = person.getEmail();
            }
        }
        return email;
    }
}
