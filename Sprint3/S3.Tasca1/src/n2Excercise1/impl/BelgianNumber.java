package n2Excercise1.impl;

import n2Excercise1.PhoneNumber;

public class BelgianNumber implements PhoneNumber {

    private String name;
    private String number;

    public BelgianNumber(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String createPhoneNumber() {
        return name + ": " + "tel: +32 " + number;
    }
}
