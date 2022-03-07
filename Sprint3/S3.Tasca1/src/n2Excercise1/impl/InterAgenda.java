package n2Excercise1.impl;

import n2Excercise1.Agenda;

import java.util.ArrayList;
import java.util.List;

public class InterAgenda implements Agenda {

    private List<String> contacts;

    public InterAgenda(){
        contacts = new ArrayList<>();
    }

    @Override
    public void addAdress(String adress) {
        contacts.add(adress);
    }

    @Override
    public void addPhoneNumber(String phoneNumber) {
        contacts.add(phoneNumber);
    }

    @Override
    public void rmContact(int index) {
        contacts.remove(index);
    }

    @Override
    public void listContacts() {
        for (String contact: contacts){
            System.out.println(contact);
            System.out.println("------------");
        }
    }


}
