package n2Excercise1.impl;

import n2Excercise1.Adress;

public class FrenchAdress implements Adress {

    private String name;
    private String via;
    private String number;
    private String floorAndDoor;
    private String postalCode;
    private String place;
    private String country;

    public FrenchAdress(String name, String via, String number, String floorAndDoor, String postalCode, String place) {
        this.name = name;
        this.via = via;
        this.number = number;
        this.floorAndDoor = floorAndDoor;
        this.postalCode = postalCode;
        this.place = place;
        country = "FRANCE";
    }

    public FrenchAdress(String name, String via, String number, String place, String postalCode) {
        this.name = name;
        this.via = via;
        this.number = number;
        this.place = place;
        this.postalCode = postalCode;
        country = "FRANCE";
    }

    @Override
    public String createAdress() {

        return name + "\n" + number + " " + floorAndDoor + " " + via + "\n" + postalCode + " " + place.toUpperCase() + " " + country ;
    }
}
