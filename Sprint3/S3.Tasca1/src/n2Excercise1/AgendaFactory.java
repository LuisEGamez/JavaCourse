package n2Excercise1;

import n2Excercise1.impl.InterAgenda;

public class AgendaFactory implements AbstractFactory{


    @Override
    public Agenda getAgenda() {
        return new InterAgenda();
    }

    @Override
    public Adress getAdress(String name, String via, String number, String floorAndDoor, String postalCode, String place, String country) {
        return null;
    }


    @Override
    public PhoneNumber getPhoneNumber(String name,String number, String country) {
        return null;
    }
}
