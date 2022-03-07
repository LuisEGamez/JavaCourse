package n2Excercise1.impl;

import n2Excercise1.Adress;

public class BelgianAdress implements Adress {

    private String name;
    private String via;
    private String number;
    private String floorAndDoor;
    private String postalCode;
    private String place;
    private String country;

    public BelgianAdress(String name, String via, String number, String floorAndDoor, String postalCode, String place) {
        this.name = name;
        this.via = via;
        this.number = number;
        this.floorAndDoor = floorAndDoor;
        this.postalCode = postalCode;
        this.place = place;
        country = "BELGIUM";
    }

    public BelgianAdress(String name, String via, String number, String place, String postalCode) {
        this.name = name;
        this.via = via;
        this.number = number;
        this.place = place;
        this.postalCode = postalCode;
        country = "BELGIUM";
    }

    @Override
    public String createAdress() {

        return name + "\n" + via  + " " + number  + " " + floorAndDoor + "\n" + postalCode + " " + place.toUpperCase() + " " + country ;
    }
}
