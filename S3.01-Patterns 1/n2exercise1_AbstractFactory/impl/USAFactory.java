package n2exercise1_AbstractFactory.impl;

import n2exercise1_AbstractFactory.CountryFactory;

public class USAFactory implements CountryFactory {

    String countryCode = "+1";
    @Override
    public USAAddress createAddress(String street, int number, int floor, String door, String city, String zipcode, String country) {
        return new USAAddress(street, number, floor, door, city, zipcode, country);
    }

    @Override
    public USAPhoneNumber createPhoneNumber(String areaCode, String localNumber) {
        return new USAPhoneNumber(countryCode, areaCode, localNumber);
    }
}
