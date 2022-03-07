package n2Excercise1;

public interface AbstractFactory {

    Agenda getAgenda();
    Adress getAdress(String name, String via, String number, String floorAndDoor,
                     String postalCode, String place, String country);
    PhoneNumber getPhoneNumber(String name,String number, String country);

}
