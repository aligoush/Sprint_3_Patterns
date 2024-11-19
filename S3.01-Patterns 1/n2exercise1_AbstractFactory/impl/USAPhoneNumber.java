package n2exercise1_AbstractFactory.impl;

import n2exercise1_AbstractFactory.PhoneNumber;

public class USAPhoneNumber implements PhoneNumber {
    private String phoneNumber;
    public USAPhoneNumber(String countryCode, String areaCode, String localNumber) {
        this.phoneNumber = countryCode + " " + areaCode + " " + localNumber;
    }
    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
