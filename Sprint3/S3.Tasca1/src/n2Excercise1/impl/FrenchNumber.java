package n2Excercise1.impl;

import n2Excercise1.PhoneNumber;

public class FrenchNumber implements PhoneNumber {

    private String name;
    private String number;

    public FrenchNumber(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String createPhoneNumber() {
        return name + ": " + "tel: +33 " + number;
    }
}
