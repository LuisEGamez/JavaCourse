package n2Excercise1;

import n2Excercise1.impl.BelgianAdress;
import n2Excercise1.impl.FrenchAdress;


public class AdressFactory implements AbstractFactory{


    @Override
    public Agenda getAgenda() {
        return null;
    }



    @Override
    public Adress getAdress(String name, String via, String number, String floorAndDoor,
                            String postalCode, String place, String country) {
        
        Adress result = null;
        if (country.equalsIgnoreCase("Belgium")){
            if (floorAndDoor.equalsIgnoreCase("")){
                floorAndDoor = null;
                result = new  BelgianAdress(name, via, number, postalCode, place);
            }else{
                result = new BelgianAdress(name, via, number, floorAndDoor, postalCode, place);
            }
        }else  if(country.equalsIgnoreCase("France")){
            if (floorAndDoor.equalsIgnoreCase("")){
                floorAndDoor = null;
                result = new FrenchAdress(name, via, number, postalCode, place);
            }else{
                result = new FrenchAdress(name, via, number, floorAndDoor, postalCode, place);
            }
        }

        return result;
    }

    @Override
    public PhoneNumber getPhoneNumber(String name,String number, String country) {
        return null;
    }
}
