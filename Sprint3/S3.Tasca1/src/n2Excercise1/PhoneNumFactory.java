package n2Excercise1;

import n2Excercise1.impl.BelgianNumber;
import n2Excercise1.impl.FrenchNumber;

public class PhoneNumFactory implements AbstractFactory{
    @Override
    public Agenda getAgenda() {
        return null;
    }

    @Override
    public Adress getAdress(String name, String via, String number, String floorAndDoor, String postalCode, String place, String country) {
        return null;
    }

    @Override
    public PhoneNumber getPhoneNumber(String name,String number, String country) {
        PhoneNumber result = null;
        if(country.equalsIgnoreCase("Belgium")){
            result = new BelgianNumber(name, number);
        }else if(country.equalsIgnoreCase("France")){
            result = new FrenchNumber(name, number);
        }
        return result;
    }
}
