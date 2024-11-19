package n2exercise1_AbstractFactory.impl;

import n2exercise1_AbstractFactory.PhoneNumber;

public class SpanishPhoneNumber implements PhoneNumber {
    private String phoneNumber;

    public SpanishPhoneNumber(String countryCode, String areaCode, String localNumber) {
        this.phoneNumber = countryCode + " " + areaCode + " " + localNumber;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
